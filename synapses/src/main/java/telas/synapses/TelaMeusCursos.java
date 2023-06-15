/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package telas;

import java.awt.Color;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;
import javax.swing.event.HyperlinkEvent;
import javax.swing.event.HyperlinkListener;

/**
 *
 * @author andre
 */
public class TelaMeusCursos extends javax.swing.JFrame {
    private Usuario logado;
    /**
     * Creates new form TelaMeusCursos
     */
    public TelaMeusCursos() {
        super ("Meus cursos"); 
        initComponents();
        btnVoltar.setBackground(new Color (0,0,0,0));        
        setLocationRelativeTo(null);
    }

    public TelaMeusCursos(Usuario logado) {
        super ("Meus cursos"); 
        initComponents();
        btnVoltar.setBackground(new Color (0,0,0,0));
        epLinkVC1.setVisible(false);
        epLinkVC2.setVisible(false);
        epLinkVC3.setVisible(false);
        epLinkVC4.setVisible(false);
        epLinkEC1.setVisible(false);
        epLinkEC2.setVisible(false);
        epLinkEC3.setVisible(false);
        epLinkEC4.setVisible(false);
        setLocationRelativeTo(null);        
        txtNCurso1.setText(logado.getCurso1());
        txtNCurso2.setText(logado.getCurso2());
        txtNCurso3.setText(logado.getCurso3());
        txtNCurso4.setText(logado.getCurso4());

        
        epLinkVC1.setEditable(false);
        epLinkVC1.setContentType("text/html");
        
        if (logado.getCurso1().equals("Java")){
            epLinkVC1.setVisible(true);
            epLinkVC1.setText("<html><a href=\"https://docs.google.com/presentation/d/1b8q6thXwRO0CnSxdASm2YtPpTwRQpplPxqy6ha53RGk/edit?usp=sharing\">Aulas Java</a></html>");
        }else if(logado.getCurso1().equals("JavaScript")){
            epLinkVC1.setVisible(true);
            epLinkVC1.setText("<html><a href=\"https://docs.google.com/presentation/d/1vOUzO7JqAxr4nz_Y2hXhSOqsoaoVzHXF51nGNAqi9xA/edit?usp=sharing\">Aulas JavaScript</a></html>");
        }else if(logado.getCurso1().equals("Python")){
            epLinkVC1.setVisible(true);
            epLinkVC1.setText("<html><a href=\"https://docs.google.com/presentation/d/1PsxvyMkZJl8pwpd4SnUQL7evMQp3EB-ONk_DHKm5prs/edit?usp=sharing\">Aulas Python</a></html>");
        }else if(logado.getCurso1().equals("PHP")){
            epLinkVC1.setVisible(true);
            epLinkVC1.setText("<html><a href=\"https://docs.google.com/presentation/d/1n-0qs1nGquNyjsj9oqbBp2bwcQ2FQ7cY8qZWJyO1WX8/edit?usp=sharing\">Aulas PHP</a></html>");
        }
        else if(logado.getCurso1().equals(" ")) {
          epLinkVC3.setVisible(false);
        }
        else if(logado.getCurso1().equals("Adm")){
            epLinkVC1.setVisible(false);
            epLinkVC2.setVisible(false);
            epLinkVC3.setVisible(false);
            epLinkVC4.setVisible(false);
            epLinkEC1.setVisible(false);
            epLinkEC2.setVisible(false);
            epLinkEC3.setVisible(false);
            epLinkEC4.setVisible(false);
            txtNCurso1.setVisible(false);
            txtNCurso2.setVisible(false);
            txtNCurso3.setVisible(false);
            txtNCurso4.setVisible(false);
        }
        else{
          epLinkVC1.setVisible(true);
          epLinkVC1.setText("aula indisponível");              
        }
        epLinkVC1.addHyperlinkListener(new HyperlinkListener() {
        @Override
        public void hyperlinkUpdate(HyperlinkEvent e) {
            if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        URI uri = e.getURL().toURI();
                        desktop.browse(uri);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    });
        
        
        epLinkVC2.setEditable(false);
        epLinkVC2.setContentType("text/html");
        if (logado.getCurso2().equals("Java")){
            epLinkVC2.setVisible(true);
            epLinkVC2.setText("<html><a href=\"https://docs.google.com/presentation/d/1b8q6thXwRO0CnSxdASm2YtPpTwRQpplPxqy6ha53RGk/edit?usp=sharing\">Aulas Java</a></html>");
        }else if(logado.getCurso2().equals("JavaScript")){
            epLinkVC2.setVisible(true);
            epLinkVC2.setText("<html><a href=\"https://docs.google.com/presentation/d/1vOUzO7JqAxr4nz_Y2hXhSOqsoaoVzHXF51nGNAqi9xA/edit?usp=sharing\">Aulas JavaScript</a></html>");
        }else if(logado.getCurso2().equals("Python")){
            epLinkVC2.setVisible(true);
            epLinkVC2.setText("<html><a href=\"https://docs.google.com/presentation/d/1PsxvyMkZJl8pwpd4SnUQL7evMQp3EB-ONk_DHKm5prs/edit?usp=sharing\">Aulas Python</a></html>");
        }else if(logado.getCurso2().equals("PHP")) {
            epLinkVC2.setVisible(true);
            epLinkVC2.setText("<html><a href=\"https://docs.google.com/presentation/d/1n-0qs1nGquNyjsj9oqbBp2bwcQ2FQ7cY8qZWJyO1WX8/edit?usp=sharing\">Aulas PHP</a></html>");
        }
        else if(logado.getCurso2().equals(" ")) {
          epLinkVC2.setVisible(false);
        }
        else if(logado.getCurso1().equals("Adm")){
            epLinkVC1.setVisible(false);
            epLinkVC2.setVisible(false);
            epLinkVC3.setVisible(false);
            epLinkVC4.setVisible(false);
            epLinkEC1.setVisible(false);
            epLinkEC2.setVisible(false);
            epLinkEC3.setVisible(false);
            epLinkEC4.setVisible(false);
            txtNCurso1.setVisible(false);
            txtNCurso2.setVisible(false);
            txtNCurso3.setVisible(false);
            txtNCurso4.setVisible(false);
        }
        else{
          epLinkVC2.setVisible(true);
          epLinkVC2.setText("aula indisponível");              
        }
        
        epLinkVC2.addHyperlinkListener(new HyperlinkListener() {
        @Override
        public void hyperlinkUpdate(HyperlinkEvent e) {
            if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        URI uri = e.getURL().toURI();
                        desktop.browse(uri);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    });
        
        
        epLinkVC3.setEditable(false);
        epLinkVC3.setContentType("text/html");
        if (logado.getCurso3().equals("Java")){
            epLinkVC3.setVisible(true);
            epLinkVC3.setText("<html><a href=\"https://docs.google.com/presentation/d/1b8q6thXwRO0CnSxdASm2YtPpTwRQpplPxqy6ha53RGk/edit?usp=sharing\">Aulas Java</a></html>");
        }else if(logado.getCurso3().equals("JavaScript")){
            epLinkVC3.setVisible(true);
            epLinkVC3.setText("<html><a href=\"https://docs.google.com/presentation/d/1vOUzO7JqAxr4nz_Y2hXhSOqsoaoVzHXF51nGNAqi9xA/edit?usp=sharing\">Aulas JavaScript</a></html>");
        }else if(logado.getCurso3().equals("Python")){
            epLinkVC3.setVisible(true);
            epLinkVC3.setText("<html><a href=\"https://docs.google.com/presentation/d/1PsxvyMkZJl8pwpd4SnUQL7evMQp3EB-ONk_DHKm5prs/edit?usp=sharing\">Aulas Python</a></html>");
        }else if(logado.getCurso3().equals("PHP")){
            epLinkVC3.setVisible(true);
            epLinkVC3.setText("<html><a href=\"https://docs.google.com/presentation/d/1n-0qs1nGquNyjsj9oqbBp2bwcQ2FQ7cY8qZWJyO1WX8/edit?usp=sharing\">Aulas PHP</a></html>");
        }
        else if(logado.getCurso3().equals(" ")) {
          epLinkVC3.setVisible(false);
        }
        else if(logado.getCurso1().equals("Adm")){
            epLinkVC1.setVisible(false);
            epLinkVC2.setVisible(false);
            epLinkVC3.setVisible(false);
            epLinkVC4.setVisible(false);
            epLinkEC1.setVisible(false);
            epLinkEC2.setVisible(false);
            epLinkEC3.setVisible(false);
            epLinkEC4.setVisible(false);
            txtNCurso1.setVisible(false);
            txtNCurso2.setVisible(false);
            txtNCurso3.setVisible(false);
            txtNCurso4.setVisible(false);
        }
        else{
          epLinkVC3.setVisible(true);
          epLinkVC3.setText("aula indisponível");              
        }
        
        
        epLinkVC3.addHyperlinkListener(new HyperlinkListener() {
        @Override
        public void hyperlinkUpdate(HyperlinkEvent e) {
            if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        URI uri = e.getURL().toURI();
                        desktop.browse(uri);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    });


        epLinkVC4.setEditable(false);
        epLinkVC4.setContentType("text/html");
        if (logado.getCurso4().equals("Java")){
            epLinkVC4.setVisible(true);
            epLinkVC4.setText("<html><a href=\"https://docs.google.com/presentation/d/1b8q6thXwRO0CnSxdASm2YtPpTwRQpplPxqy6ha53RGk/edit?usp=sharing\">Aulas Java</a></html>");
        }else if(logado.getCurso4().equals("JavaScript")){
            epLinkVC4.setVisible(true);
            epLinkVC4.setText("<html><a href=\"https://docs.google.com/presentation/d/1vOUzO7JqAxr4nz_Y2hXhSOqsoaoVzHXF51nGNAqi9xA/edit?usp=sharing\">Aulas JavaScript</a></html>");
        }else if(logado.getCurso4().equals("Python")){
            epLinkVC4.setVisible(true);
            epLinkVC4.setText("<html><a href=\"https://docs.google.com/presentation/d/1PsxvyMkZJl8pwpd4SnUQL7evMQp3EB-ONk_DHKm5prs/edit?usp=sharing\">Aulas Python</a></html>");
        }else if(logado.getCurso4().equals("PHP")){
            epLinkVC4.setVisible(true);
            epLinkVC4.setText("<html><a href=\"https://docs.google.com/presentation/d/1n-0qs1nGquNyjsj9oqbBp2bwcQ2FQ7cY8qZWJyO1WX8/edit?usp=sharing\">Aulas PHP</a></html>");
        }
        else if(logado.getCurso4().equals(" ")) {
          epLinkVC4.setVisible(false);            
        }
        else if(logado.getCurso1().equals("Adm")){
            epLinkVC1.setVisible(false);
            epLinkVC2.setVisible(false);
            epLinkVC3.setVisible(false);
            epLinkVC4.setVisible(false);
            epLinkEC1.setVisible(false);
            epLinkEC2.setVisible(false);
            epLinkEC3.setVisible(false);
            epLinkEC4.setVisible(false);
            txtNCurso1.setVisible(false);
            txtNCurso2.setVisible(false);
            txtNCurso3.setVisible(false);
            txtNCurso4.setVisible(false);
        }
        else{
          epLinkVC4.setVisible(true);
          epLinkVC4.setText("aula indisponível");              
        }
        
        
        epLinkVC4.addHyperlinkListener(new HyperlinkListener() {
        @Override
        public void hyperlinkUpdate(HyperlinkEvent e) {
            if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        URI uri = e.getURL().toURI();
                        desktop.browse(uri);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    });

        epLinkEC1.setEditable(false);
        epLinkEC1.setContentType("text/html");
         if (logado.getCurso1().equals("Java")){
            epLinkEC1.setVisible(true);
            epLinkEC1.setText("<html><a href=\"https://docs.google.com/document/d/1O2PbX-iu54h3Wpi_SuYdV0SsZgO5xktW7OiDREJBDfc/edit?usp=sharing\">Exercícios Java</a></html>");
        }else if(logado.getCurso1().equals("JavaScript")){
            epLinkEC1.setVisible(true);
            epLinkEC1.setText("<html><a href=\"https://docs.google.com/document/d/1fZiet37q7Y0lfq7AMz0zrlih4Qy5S31Ysyn3s1YNJiA/edit?usp=sharing\">Exercícios JavaScript</a></html>");
        }else if(logado.getCurso1().equals("Python")){
            epLinkEC1.setVisible(true);
            epLinkEC1.setText("<html><a href=\"https://docs.google.com/document/d/1y0Zo2FEIrYrIdBkCT_ogFdL0HSaVPTOKT33fZ2RUCug/edit?usp=sharing\">Exercícios Python</a></html>");
        }else if(logado.getCurso1().equals("PHP")){
            epLinkEC1.setVisible(true);
            epLinkEC1.setText("<html><a href=\"https://docs.google.com/document/d/15h8DunQpMq0qkLTSUeOEeLjqtb6y13eXr1wN9byEZVY/edit?usp=sharing\">Exercícios PHP</a></html>");
        }
        else if(logado.getCurso1().equals(" ")) {
          epLinkEC1.setVisible(false);            
        }
        else if(logado.getCurso1().equals("Adm")){
            epLinkVC1.setVisible(false);
            epLinkVC2.setVisible(false);
            epLinkVC3.setVisible(false);
            epLinkVC4.setVisible(false);
            epLinkEC1.setVisible(false);
            epLinkEC2.setVisible(false);
            epLinkEC3.setVisible(false);
            epLinkEC4.setVisible(false);
            txtNCurso1.setVisible(false);
            txtNCurso2.setVisible(false);
            txtNCurso3.setVisible(false);
            txtNCurso4.setVisible(false);
        }
        else{
          epLinkEC1.setVisible(true);
          epLinkEC1.setText("aula indisponível");              
        }
         
        epLinkEC1.addHyperlinkListener(new HyperlinkListener() {
        @Override
        public void hyperlinkUpdate(HyperlinkEvent e) {
            if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        URI uri = e.getURL().toURI();
                        desktop.browse(uri);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    });

        epLinkEC2.setEditable(false);
        epLinkEC2.setContentType("text/html");
         if (logado.getCurso2().equals("Java")){
            epLinkEC2.setVisible(true);
            epLinkEC2.setText("<html><a href=\"https://docs.google.com/document/d/1O2PbX-iu54h3Wpi_SuYdV0SsZgO5xktW7OiDREJBDfc/edit?usp=sharing\">Exercícios Java</a></html>");
        }else if(logado.getCurso2().equals("JavaScript")){
            epLinkEC2.setVisible(true);
            epLinkEC2.setText("<html><a href=\"https://docs.google.com/document/d/1fZiet37q7Y0lfq7AMz0zrlih4Qy5S31Ysyn3s1YNJiA/edit?usp=sharing\">Exercícios JavaScript</a></html>");
        }else if(logado.getCurso2().equals("Python")){
            epLinkEC2.setVisible(true);
            epLinkEC2.setText("<html><a href=\"https://docs.google.com/document/d/1y0Zo2FEIrYrIdBkCT_ogFdL0HSaVPTOKT33fZ2RUCug/edit?usp=sharing\">Exercícios Python</a></html>");
        }else if(logado.getCurso2().equals("PHP")){
            epLinkEC2.setVisible(true);
            epLinkEC2.setText("<html><a href=\"https://docs.google.com/document/d/15h8DunQpMq0qkLTSUeOEeLjqtb6y13eXr1wN9byEZVY/edit?usp=sharing\">Exercícios PHP</a></html>");
        }
        else if(logado.getCurso2().equals(" ")) {
          epLinkEC2.setVisible(false);            
        }
        else if(logado.getCurso1().equals("Adm")){
            epLinkVC1.setVisible(false);
            epLinkVC2.setVisible(false);
            epLinkVC3.setVisible(false);
            epLinkVC4.setVisible(false);
            epLinkEC1.setVisible(false);
            epLinkEC2.setVisible(false);
            epLinkEC3.setVisible(false);
            epLinkEC4.setVisible(false);
            txtNCurso1.setVisible(false);
            txtNCurso2.setVisible(false);
            txtNCurso3.setVisible(false);
            txtNCurso4.setVisible(false);
        }
        else{
          epLinkEC2.setVisible(true);
          epLinkEC2.setText("aula indisponível");              
        }
        
         
        epLinkEC2.addHyperlinkListener(new HyperlinkListener() {
        @Override
        public void hyperlinkUpdate(HyperlinkEvent e) {
            if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        URI uri = e.getURL().toURI();
                        desktop.browse(uri);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    });  

        epLinkEC3.setEditable(false);
        epLinkEC3.setContentType("text/html");
         if (logado.getCurso3().equals("Java")){
            epLinkEC3.setVisible(true);
            epLinkEC3.setText("<html><a href=\"https://docs.google.com/document/d/1O2PbX-iu54h3Wpi_SuYdV0SsZgO5xktW7OiDREJBDfc/edit?usp=sharing\">Exercícios Java</a></html>");
        }else if(logado.getCurso3().equals("JavaScript")){
            epLinkEC3.setVisible(true);
            epLinkEC3.setText("<html><a href=\"https://docs.google.com/document/d/1fZiet37q7Y0lfq7AMz0zrlih4Qy5S31Ysyn3s1YNJiA/edit?usp=sharing\">Exercícios JavaScript</a></html>");
        }else if(logado.getCurso3().equals("Python")){
            epLinkEC3.setVisible(true);
            epLinkEC3.setText("<html><a href=\"https://docs.google.com/document/d/1y0Zo2FEIrYrIdBkCT_ogFdL0HSaVPTOKT33fZ2RUCug/edit?usp=sharing\">Exercícios Python</a></html>");
        }else if(logado.getCurso3().equals("PHP")){
            epLinkEC3.setVisible(true);
            epLinkEC3.setText("<html><a href=\"https://docs.google.com/document/d/15h8DunQpMq0qkLTSUeOEeLjqtb6y13eXr1wN9byEZVY/edit?usp=sharing\">Exercícios PHP</a></html>");
        }
        else if(logado.getCurso3().equals(" ")) {
          epLinkEC3.setVisible(false);            
        }
        else if(logado.getCurso1().equals("Adm")){
            epLinkVC1.setVisible(false);
            epLinkVC2.setVisible(false);
            epLinkVC3.setVisible(false);
            epLinkVC4.setVisible(false);
            epLinkEC1.setVisible(false);
            epLinkEC2.setVisible(false);
            epLinkEC3.setVisible(false);
            epLinkEC4.setVisible(false);
            txtNCurso1.setVisible(false);
            txtNCurso2.setVisible(false);
            txtNCurso3.setVisible(false);
            txtNCurso4.setVisible(false);
        }
        else{
          epLinkEC3.setVisible(true);
          epLinkEC3.setText("aula indisponível");              
        }
         
         
        epLinkEC3.addHyperlinkListener(new HyperlinkListener() {
        @Override
        public void hyperlinkUpdate(HyperlinkEvent e) {
            if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        URI uri = e.getURL().toURI();
                        desktop.browse(uri);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    });  

        epLinkEC4.setEditable(false);
        epLinkEC4.setContentType("text/html");
         if (logado.getCurso4().equals("Java")){
            epLinkEC4.setVisible(true);
            epLinkEC4.setText("<html><a href=\"https://docs.google.com/document/d/1O2PbX-iu54h3Wpi_SuYdV0SsZgO5xktW7OiDREJBDfc/edit?usp=sharing\">Exercícios Java</a></html>");
        }else if(logado.getCurso4().equals("JavaScript")){
            epLinkEC4.setVisible(true);
            epLinkEC4.setText("<html><a href=\"https://docs.google.com/document/d/1fZiet37q7Y0lfq7AMz0zrlih4Qy5S31Ysyn3s1YNJiA/edit?usp=sharing\">Exercícios JavaScript</a></html>");
        }else if(logado.getCurso4().equals("Python")){
            epLinkEC4.setVisible(true);
            epLinkEC4.setText("<html><a href=\"https://docs.google.com/document/d/1y0Zo2FEIrYrIdBkCT_ogFdL0HSaVPTOKT33fZ2RUCug/edit?usp=sharing\">Exercícios Python</a></html>");
        }else if(logado.getCurso4().equals("PHP")){
            epLinkEC4.setVisible(true);
            epLinkEC4.setText("<html><a href=\"https://docs.google.com/document/d/15h8DunQpMq0qkLTSUeOEeLjqtb6y13eXr1wN9byEZVY/edit?usp=sharing\">Exercícios PHP</a></html>");
        }
        else if(logado.getCurso4().equals(" ")) {
          epLinkEC4.setVisible(false);            
        }
        else if(logado.getCurso1().equals("Adm")){
            epLinkVC1.setVisible(false);
            epLinkVC2.setVisible(false);
            epLinkVC3.setVisible(false);
            epLinkVC4.setVisible(false);
            epLinkEC1.setVisible(false);
            epLinkEC2.setVisible(false);
            epLinkEC3.setVisible(false);
            epLinkEC4.setVisible(false);
            txtNCurso1.setVisible(false);
            txtNCurso2.setVisible(false);
            txtNCurso3.setVisible(false);
            txtNCurso4.setVisible(false);
        }
        else{
          epLinkEC4.setVisible(true);
          epLinkEC4.setText("aula indisponível");              
        }
         
        epLinkEC4.addHyperlinkListener(new HyperlinkListener() {
        @Override
        public void hyperlinkUpdate(HyperlinkEvent e) {
            if (e.getEventType() == HyperlinkEvent.EventType.ACTIVATED) {
                if (Desktop.isDesktopSupported()) {
                    Desktop desktop = Desktop.getDesktop();
                    try {
                        URI uri = e.getURL().toURI();
                        desktop.browse(uri);
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }); 
        if(logado.getCurso1().equals(" ")){
           JOptionPane.showMessageDialog(null,"Você ainda não está cadastrado em nenhum curso! \n Para se cadastrar acesse a área Cursos Disponíveis."); 
            epLinkVC1.setVisible(false);
            epLinkVC2.setVisible(false);
            epLinkVC3.setVisible(false);
            epLinkVC4.setVisible(false);
            epLinkEC1.setVisible(false);
            epLinkEC2.setVisible(false);
            epLinkEC3.setVisible(false);
            epLinkEC4.setVisible(false);           
        }
        this.logado = logado;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNCurso1 = new javax.swing.JLabel();
        txtNCurso2 = new javax.swing.JLabel();
        txtNCurso3 = new javax.swing.JLabel();
        txtNCurso4 = new javax.swing.JLabel();
        epLinkVC2 = new javax.swing.JEditorPane();
        epLinkVC1 = new javax.swing.JEditorPane();
        epLinkVC3 = new javax.swing.JEditorPane();
        epLinkVC4 = new javax.swing.JEditorPane();
        epLinkEC4 = new javax.swing.JEditorPane();
        epLinkEC3 = new javax.swing.JEditorPane();
        epLinkEC2 = new javax.swing.JEditorPane();
        epLinkEC1 = new javax.swing.JEditorPane();
        jPanel1 = new javax.swing.JPanel();
        btnVoltar = new javax.swing.JButton();
        imgFundoMeusCursos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNCurso1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNCurso1.setForeground(new java.awt.Color(0, 0, 0));
        txtNCurso1.setText("jLabel1");
        getContentPane().add(txtNCurso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        txtNCurso2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNCurso2.setForeground(new java.awt.Color(0, 0, 0));
        txtNCurso2.setText("jLabel1");
        getContentPane().add(txtNCurso2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, -1));

        txtNCurso3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNCurso3.setForeground(new java.awt.Color(0, 0, 0));
        txtNCurso3.setText("jLabel1");
        getContentPane().add(txtNCurso3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        txtNCurso4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNCurso4.setForeground(new java.awt.Color(0, 0, 0));
        txtNCurso4.setText("jLabel1");
        getContentPane().add(txtNCurso4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, -1));
        getContentPane().add(epLinkVC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, -1, -1));
        getContentPane().add(epLinkVC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, -1));
        getContentPane().add(epLinkVC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, -1, -1));
        getContentPane().add(epLinkVC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));
        getContentPane().add(epLinkEC4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 270, -1, -1));
        getContentPane().add(epLinkEC3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));
        getContentPane().add(epLinkEC2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 190, -1, -1));
        getContentPane().add(epLinkEC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, -1));

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 440, 190));

        btnVoltar.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1113296736774008902/btnVoltar_1.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        btnVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnVoltarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnVoltarMouseExited(evt);
            }
        });
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(btnVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 330, 140, 40));

        imgFundoMeusCursos.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1111060429163200682/TelaMeusCursos.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        getContentPane().add(imgFundoMeusCursos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVoltarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseEntered
        btnVoltar.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1113296735628963870/btnVoltar2.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnVoltarMouseEntered

    private void btnVoltarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVoltarMouseExited
        btnVoltar.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://cdn.discordapp.com/attachments/1084193880951504908/1113296736774008902/btnVoltar_1.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
    }//GEN-LAST:event_btnVoltarMouseExited

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaMenu tm = new TelaMenu(logado);
        tm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaMeusCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMeusCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMeusCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMeusCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMeusCursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVoltar;
    private javax.swing.JEditorPane epLinkEC1;
    private javax.swing.JEditorPane epLinkEC2;
    private javax.swing.JEditorPane epLinkEC3;
    private javax.swing.JEditorPane epLinkEC4;
    private javax.swing.JEditorPane epLinkVC1;
    private javax.swing.JEditorPane epLinkVC2;
    private javax.swing.JEditorPane epLinkVC3;
    private javax.swing.JEditorPane epLinkVC4;
    private javax.swing.JLabel imgFundoMeusCursos;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtNCurso1;
    private javax.swing.JLabel txtNCurso2;
    private javax.swing.JLabel txtNCurso3;
    private javax.swing.JLabel txtNCurso4;
    // End of variables declaration//GEN-END:variables
}
