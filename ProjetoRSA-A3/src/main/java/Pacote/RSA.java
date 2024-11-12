/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pacote;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Arrays;
import javax.swing.JLabel;


public class RSA {

    // Gera um número candidato a primo
    public BigInteger gerarCandidatoPrimo(int tamanho) {
        SecureRandom random = new SecureRandom();
        BigInteger p = new BigInteger(tamanho, random);

        // Garantir que o número é ímpar e tenha o comprimento correto
        p = p.setBit(tamanho - 1); // Garante que tem o tamanho correto
        p = p.setBit(0);           // Garante que é ímpar
        return p;
    }

    // Gera um número primo de comprimento especificado em bits
    public BigInteger gerarNumeroPrimo(int tamanho) {
        BigInteger p = gerarCandidatoPrimo(tamanho);
        while (!p.isProbablePrime(100)) {  // Verifica se é primo com alta precisão
            p = p.add(BigInteger.TWO);     // Se não for primo, incrementa por 2
        }
        return p;
    }

    // Gera o par de chaves RSA (pública e privada)
    public BigInteger[] gerarParDeChaves(int tamanho,JLabel lblp,JLabel lblq,JLabel lblN,JLabel lblPhi_n,JLabel lblE,JLabel lblD ) {
        BigInteger p;
        BigInteger q;

        do {
            p = gerarNumeroPrimo(tamanho / 2); // Gera p
            q = gerarNumeroPrimo(tamanho / 2); // Gera q
        }while (p.toString().equals(q.toString())); // Continue até que p e q sejam diferentes
        lblp.setText("p = "+String.valueOf(p));
        lblq.setText("q = "+String.valueOf(q));
        BigInteger n = p.multiply(q);  // n = p * q
        BigInteger phi_n = (p.subtract(BigInteger.ONE)).multiply(q.subtract(BigInteger.ONE)); // φ(n) = (p-1)*(q-1)

        // Define o valor de e como 65537 (valor padrão e eficiente)
        BigInteger e = BigInteger.valueOf(65537);
        BigInteger d = e.modInverse(phi_n);  // Calcula d como o inverso modular de e mod φ(n)
        lblN.setText("n = p x q = "+String.valueOf(n));
        lblPhi_n.setText("φ(n) = (p-1)x(q-1) = "+String.valueOf(phi_n));
        lblE.setText("e = "+String.valueOf(e));
        lblD.setText("d ≡ e-¹ mod ϕ(n) ="+String.valueOf(d));
        return new BigInteger[]{e, d, n};  // Retorna a chave pública e privada: [e, d, n]
    }

    // Criptografa a mensagem usando a chave pública
    public BigInteger criptografar(BigInteger e, BigInteger n, String textoPlano, JLabel lblMensagemInt) {
        byte[] textoPlanoBytes = textoPlano.getBytes();
        BigInteger textoPlanoInt = new BigInteger(1, textoPlanoBytes); // Converte a mensagem em número inteiro
        lblMensagemInt.setText("MensagemInt ="+String.valueOf(textoPlanoInt));
        if (textoPlanoInt.compareTo(n) >= 0) {
            throw new IllegalArgumentException("O texto plano é muito grande para ser criptografado com a chave atual.");
        }

        return textoPlanoInt.modPow(e, n);  // Retorna o texto criptografado
    }

    // Descriptografa a mensagem usando a chave privada
    public String descriptografar(BigInteger d, BigInteger n, BigInteger ciphertext) {
    // Descriptografa o ciphertext
    BigInteger textoPlanoInt = ciphertext.modPow(d, n);  

    // Converte o número de volta para bytes
    byte[] textoPlanoBytes = textoPlanoInt.toByteArray();

    // Se o primeiro byte for 0, removemos ele (caso o número seja muito grande)
    if (textoPlanoBytes[0] == 0) {
        textoPlanoBytes = Arrays.copyOfRange(textoPlanoBytes, 1, textoPlanoBytes.length);
    }

    // Retorna o texto descriptografado
    return new String(textoPlanoBytes, StandardCharsets.UTF_8);  // Use UTF-8 para garantir a codificação correta
}

}
