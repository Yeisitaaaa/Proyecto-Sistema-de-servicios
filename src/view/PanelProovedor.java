/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import Controlador.*;
import Modelo.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author User
 */
public class PanelProovedor extends javax.swing.JFrame {
    private int filaSeleccionada=-1;
    public static String CedulaSesion="";
    
    
    public PanelProovedor() {
        initComponents();
        cbxModalidad.setSelectedIndex(0);
         cbxCategoria.setSelectedIndex(0);
        txtValorHora.setEditable(false);
        txtTarifaFija.setEditable(false);
        cbxAdicional.setSelectedItem("Ninguno");
        txtValorAgregado.setText("0");
        txtValorAgregado.setEditable(false);
        Controlador.ControladorProveedor.listarMisServicios(tablaServicios, CedulaSesion);
    }
  public void limpiarCampos() {
    txtNombre.setText("");
    txtLocalidad.setText("");
    txtValorHora.setText("");
    txtTarifaFija.setText("");
    txtValorAgregado.setText("0");
    cbxModalidad.setSelectedIndex(0); 
    cbxCategoria.setSelectedIndex(0); 
    cbxAdicional.setSelectedItem("Ninguno");
    txtValorHora.setEditable(false);
    txtTarifaFija.setEditable(false);
    txtValorAgregado.setEditable(false);
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        GSV = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        GST = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        SAC = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel31 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        tab = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        crearS = new javax.swing.JButton();
        MisS = new javax.swing.JButton();
        jPanel22 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel38 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaSoli = new javax.swing.JTable();
        rechazarSoli = new javax.swing.JButton();
        AceptarSoli = new javax.swing.JButton();
        jLabel42 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tablaActivos = new javax.swing.JTable();
        finalizarServicio = new javax.swing.JButton();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        txtLocalidad = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        CrearServicio = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel35 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        cbxCategoria = new javax.swing.JComboBox<>();
        jLabel62 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        cbxAdicional = new javax.swing.JComboBox<>();
        jLabel67 = new javax.swing.JLabel();
        txtValorHora = new javax.swing.JTextField();
        jLabel61 = new javax.swing.JLabel();
        txtTarifaFija = new javax.swing.JTextField();
        jLabel63 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel64 = new javax.swing.JLabel();
        txtValorAgregado = new javax.swing.JTextField();
        cbxModalidad = new javax.swing.JComboBox<>();
        jLabel68 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel59 = new javax.swing.JLabel();
        EditarServicio = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        EliminarServicio = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaServicios = new javax.swing.JTable();
        jPanel14 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel22 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jLabel19 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        ServicioNuevo = new javax.swing.JTextField();
        actualizarServicio = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        PrecioBaseNuevo = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        CategoriaNueva = new javax.swing.JComboBox<>();
        LocalidadNueva = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        ValorAgregadoNuevo = new javax.swing.JTextField();
        AdicionalNuevo = new javax.swing.JComboBox<>();
        Actual = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        LocalidadActual = new javax.swing.JTextField();
        ServicioActual = new javax.swing.JTextField();
        jLabel65 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        CategoriaActual = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        ModalidadActual = new javax.swing.JTextField();
        jLabel70 = new javax.swing.JLabel();
        ValorTotalActual = new javax.swing.JTextField();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        PrecioBaseActual = new javax.swing.JTextField();
        AdicionalActual = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        ValorAgregadoActual = new javax.swing.JTextField();
        jLabel75 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GSV.setBackground(new java.awt.Color(153, 153, 153));
        GSV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GSVMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GSVMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GSVMouseExited(evt);
            }
        });
        GSV.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("servicios");
        GSV.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Gestion de ");
        GSV.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gestion-de-proyectos (1).png"))); // NOI18N
        GSV.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 60, 60));

        jPanel2.add(GSV, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 210, 90));

        GST.setBackground(new java.awt.Color(153, 153, 153));
        GST.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GSTMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GSTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GSTMouseExited(evt);
            }
        });
        GST.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Gestion de");
        GST.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("solicitudes");
        GST.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprobar (1).png"))); // NOI18N
        jLabel55.setText("jLabel42");
        GST.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 60));

        jPanel2.add(GST, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 210, 90));

        SAC.setBackground(new java.awt.Color(153, 153, 153));
        SAC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SACMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SACMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SACMouseExited(evt);
            }
        });
        SAC.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Servicios");
        SAC.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("activos");
        SAC.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/servicio-al-cliente.png"))); // NOI18N
        SAC.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 60));

        jPanel2.add(SAC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 210, 90));

        jLabel10.setBackground(new java.awt.Color(0, 0, 0));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 140, -1));

        jLabel12.setBackground(new java.awt.Color(0, 0, 0));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel12.setText("Bienvenido");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cerrar sesion");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 580, 140, 30));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrevista-de-trabajo.png"))); // NOI18N
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 160, 130));

        jLabel40.setBackground(new java.awt.Color(0, 0, 0));
        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel40.setText("Bienvenido");
        jPanel2.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 610));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Sistema de servicios");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 590, 60));

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("PANEL PROOVEDOR");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));
        jPanel4.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 290, 20));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 590, 30));

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crearS.setBackground(new java.awt.Color(0, 0, 0));
        crearS.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        crearS.setForeground(new java.awt.Color(255, 255, 255));
        crearS.setText("Crear servicios");
        crearS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        crearS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearSMouseClicked(evt);
            }
        });
        crearS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearSActionPerformed(evt);
            }
        });
        jPanel5.add(crearS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 230, 50));

        MisS.setBackground(new java.awt.Color(0, 0, 0));
        MisS.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        MisS.setForeground(new java.awt.Color(255, 255, 255));
        MisS.setText("Mis servicios");
        MisS.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        MisS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MisSMouseClicked(evt);
            }
        });
        MisS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MisSActionPerformed(evt);
            }
        });
        jPanel5.add(MisS, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 230, 50));

        jPanel22.setBackground(new java.awt.Color(153, 153, 153));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel22.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));
        jPanel22.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 290, 20));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Gestion de servicios ");
        jPanel22.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 30));

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gestion-de-proyectos.png"))); // NOI18N
        jPanel22.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 30, 50));

        jPanel5.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 320, 50));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/computadora (1).png"))); // NOI18N
        jPanel5.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 130, 130));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/svg (1).png"))); // NOI18N
        jPanel5.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 130, 130));

        tab.addTab("GSERVI", jPanel5);

        jPanel11.setBackground(new java.awt.Color(204, 204, 204));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(153, 153, 153));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));
        jPanel7.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 290, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Gestion de solicitudes ");
        jPanel7.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 30));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/aprobar.png"))); // NOI18N
        jPanel7.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, -1, 50));

        jPanel11.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 340, 50));

        tablaSoli.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaSoli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Solicitante", "Barrio", "Servicio"
            }
        ));
        jScrollPane2.setViewportView(tablaSoli);

        jPanel11.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 550, 230));

        rechazarSoli.setBackground(new java.awt.Color(204, 0, 0));
        rechazarSoli.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        rechazarSoli.setForeground(new java.awt.Color(255, 255, 255));
        rechazarSoli.setText("Rechazar");
        rechazarSoli.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        rechazarSoli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rechazarSoliMouseClicked(evt);
            }
        });
        rechazarSoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rechazarSoliActionPerformed(evt);
            }
        });
        jPanel11.add(rechazarSoli, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 110, 40));

        AceptarSoli.setBackground(new java.awt.Color(51, 153, 0));
        AceptarSoli.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        AceptarSoli.setForeground(new java.awt.Color(255, 255, 255));
        AceptarSoli.setText("Aceptar");
        AceptarSoli.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        AceptarSoli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AceptarSoliMouseClicked(evt);
            }
        });
        AceptarSoli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarSoliActionPerformed(evt);
            }
        });
        jPanel11.add(AceptarSoli, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 340, 110, 40));

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/comprobado.png"))); // NOI18N
        jPanel11.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 40, 60));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/no-hay-entrada (1).png"))); // NOI18N
        jPanel11.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 50, 60));

        tab.addTab("GSOLI", jPanel11);

        jPanel10.setBackground(new java.awt.Color(204, 204, 204));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBackground(new java.awt.Color(153, 153, 153));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel20.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));
        jPanel20.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 290, 20));

        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Servicios Activos");
        jPanel20.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 30));

        jPanel10.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 320, 50));

        tablaActivos.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaActivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Solicitante", "Localidad", "Servicio", "Modalidad", "Adicional", "Valor total"
            }
        ));
        jScrollPane5.setViewportView(tablaActivos);

        jPanel10.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 550, 230));

        finalizarServicio.setBackground(new java.awt.Color(51, 153, 0));
        finalizarServicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        finalizarServicio.setForeground(new java.awt.Color(255, 255, 255));
        finalizarServicio.setText("Finalizar servicio");
        finalizarServicio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        finalizarServicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                finalizarServicioMouseClicked(evt);
            }
        });
        finalizarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarServicioActionPerformed(evt);
            }
        });
        jPanel10.add(finalizarServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 120, 40));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/comprobado.png"))); // NOI18N
        jPanel10.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 40, 40));

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/servicio-al-cliente.png"))); // NOI18N
        jPanel10.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 60, 60));

        tab.addTab("SACTI", jPanel10);

        jPanel12.setBackground(new java.awt.Color(204, 204, 204));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtLocalidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalidadActionPerformed(evt);
            }
        });
        jPanel12.add(txtLocalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 140, 30));

        jLabel29.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel29.setText("Localidad");
        jPanel12.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, 20));

        CrearServicio.setBackground(new java.awt.Color(51, 153, 0));
        CrearServicio.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        CrearServicio.setForeground(new java.awt.Color(255, 255, 255));
        CrearServicio.setText("Crea tu servicio");
        CrearServicio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CrearServicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearServicioMouseClicked(evt);
            }
        });
        CrearServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearServicioActionPerformed(evt);
            }
        });
        jPanel12.add(CrearServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 180, 40));

        jPanel21.setBackground(new java.awt.Color(153, 153, 153));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel21.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));
        jPanel21.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 230, 20));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("Crear servicios");
        jPanel21.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, 30));

        jPanel12.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 250, 50));

        jLabel44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/svg.png"))); // NOI18N
        jLabel44.setText("jLabel42");
        jPanel12.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 70, 70));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel46.setText("Servicio");
        jPanel12.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, 20));

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel12.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 140, 30));

        cbxCategoria.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Belleza", "Hogar", "Educacion" }));
        cbxCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCategoriaActionPerformed(evt);
            }
        });
        jPanel12.add(cbxCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 140, 30));

        jLabel62.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel62.setText("Categoria");
        jPanel12.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 20));

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("MODALIDAD");
        jPanel13.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 20));

        cbxAdicional.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxAdicional.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Domicilio", "otro", " " }));
        cbxAdicional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxAdicionalActionPerformed(evt);
            }
        });
        jPanel13.add(cbxAdicional, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 130, 30));

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("Valor hora");
        jPanel13.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, 20));

        txtValorHora.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtValorHora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorHoraActionPerformed(evt);
            }
        });
        jPanel13.add(txtValorHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 90, 30));

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Tarifa fija");
        jPanel13.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, 20));

        txtTarifaFija.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtTarifaFija.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTarifaFijaActionPerformed(evt);
            }
        });
        jPanel13.add(txtTarifaFija, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, 90, 30));

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("ADICIONAL");
        jPanel13.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, 20));
        jPanel13.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 360, 20));

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Agregado");
        jPanel13.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 70, 20));

        txtValorAgregado.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtValorAgregado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorAgregadoActionPerformed(evt);
            }
        });
        jPanel13.add(txtValorAgregado, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 90, 30));

        cbxModalidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cbxModalidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Por Hora", "Tarifa Fija" }));
        cbxModalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxModalidadActionPerformed(evt);
            }
        });
        jPanel13.add(cbxModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 130, 30));

        jLabel68.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Valor");
        jPanel13.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 50, 20));

        jPanel12.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 360, 260));

        tab.addTab("CREAR", jPanel12);

        jPanel16.setBackground(new java.awt.Color(204, 204, 204));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/computadora (1).png"))); // NOI18N
        jPanel16.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, 140));

        EditarServicio.setBackground(new java.awt.Color(0, 0, 255));
        EditarServicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EditarServicio.setForeground(new java.awt.Color(255, 255, 255));
        EditarServicio.setText("Editar servicio");
        EditarServicio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EditarServicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditarServicioMouseClicked(evt);
            }
        });
        EditarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarServicioActionPerformed(evt);
            }
        });
        jPanel16.add(EditarServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 130, 40));

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/curriculum.png"))); // NOI18N
        jPanel16.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 50, 50));

        EliminarServicio.setBackground(new java.awt.Color(204, 0, 0));
        EliminarServicio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        EliminarServicio.setForeground(new java.awt.Color(255, 255, 255));
        EliminarServicio.setText("Eliminar servicio");
        EliminarServicio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        EliminarServicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EliminarServicioMouseClicked(evt);
            }
        });
        EliminarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarServicioActionPerformed(evt);
            }
        });
        jPanel16.add(EliminarServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 130, 40));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/borrar.png"))); // NOI18N
        jPanel16.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 40, 40));

        tablaServicios.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tablaServicios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Categoria", "Servicio", "Localidad", "Modalidad", "Precio Base", "Adicional", "Valor Add+", "Valor total"
            }
        ));
        tablaServicios.setAutoscrolls(false);
        tablaServicios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaServiciosMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tablaServicios);

        jPanel16.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 550, 80));

        jPanel14.setBackground(new java.awt.Color(153, 153, 153));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel14.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));
        jPanel14.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 220, 20));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("MIS SERVICIOS");
        jPanel14.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jPanel16.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 240, 50));

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/computadora.png"))); // NOI18N
        jPanel16.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 100, 70));

        tab.addTab("MiSer", jPanel16);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setForeground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel9.setBackground(new java.awt.Color(153, 153, 153));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel9.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));
        jPanel9.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 310, 20));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("EDITAR MIS SERVICIOS");
        jPanel9.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/curriculum.png"))); // NOI18N
        jPanel9.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 40, 50));

        jPanel6.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 30, 350, 50));

        jPanel17.setBackground(new java.awt.Color(153, 153, 153));
        jPanel17.setForeground(new java.awt.Color(255, 255, 255));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("NUEVA INFORMACION");
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(255, 255, 255), null, null));
        jPanel17.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 20));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Agregado");
        jPanel17.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 80, 20));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Categoria");
        jPanel17.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        ServicioNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServicioNuevoActionPerformed(evt);
            }
        });
        jPanel17.add(ServicioNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 160, 30));

        actualizarServicio.setBackground(new java.awt.Color(51, 153, 0));
        actualizarServicio.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        actualizarServicio.setForeground(new java.awt.Color(255, 255, 255));
        actualizarServicio.setText("Actualizar");
        actualizarServicio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        actualizarServicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizarServicioMouseClicked(evt);
            }
        });
        actualizarServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarServicioActionPerformed(evt);
            }
        });
        jPanel17.add(actualizarServicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 100, 30));

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Servicio");
        jPanel17.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 20));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Localidad");
        jPanel17.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        PrecioBaseNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioBaseNuevoActionPerformed(evt);
            }
        });
        jPanel17.add(PrecioBaseNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 160, 30));

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Precio base");
        jPanel17.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        CategoriaNueva.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CategoriaNueva.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Belleza", "Hogar", "Educacion" }));
        CategoriaNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaNuevaActionPerformed(evt);
            }
        });
        jPanel17.add(CategoriaNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 160, 30));

        LocalidadNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocalidadNuevaActionPerformed(evt);
            }
        });
        jPanel17.add(LocalidadNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 160, 30));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Adicional");
        jPanel17.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 70, 20));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Valor");
        jPanel17.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 40, 20));

        ValorAgregadoNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorAgregadoNuevoActionPerformed(evt);
            }
        });
        jPanel17.add(ValorAgregadoNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 160, 30));

        AdicionalNuevo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AdicionalNuevo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Domicilio", "otro", " " }));
        AdicionalNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionalNuevoActionPerformed(evt);
            }
        });
        jPanel17.add(AdicionalNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 160, 30));

        jPanel6.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 270, 380));

        Actual.setBackground(new java.awt.Color(255, 255, 255));
        Actual.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("INFORMACION ACTUAL");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 0, 0), null, null));
        Actual.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel60.setText("Localidad");
        Actual.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        LocalidadActual.setEditable(false);
        LocalidadActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocalidadActualActionPerformed(evt);
            }
        });
        Actual.add(LocalidadActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 160, 30));

        ServicioActual.setEditable(false);
        ServicioActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ServicioActualActionPerformed(evt);
            }
        });
        Actual.add(ServicioActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 160, 30));

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel65.setText("Servicio");
        Actual.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setText("Categoria");
        Actual.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        CategoriaActual.setEditable(false);
        CategoriaActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CategoriaActualActionPerformed(evt);
            }
        });
        Actual.add(CategoriaActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 160, 30));

        jLabel53.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel53.setText("Modalidad");
        Actual.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        ModalidadActual.setEditable(false);
        ModalidadActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModalidadActualActionPerformed(evt);
            }
        });
        Actual.add(ModalidadActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 160, 30));

        jLabel70.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel70.setText("Adicional");
        Actual.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        ValorTotalActual.setEditable(false);
        ValorTotalActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorTotalActualActionPerformed(evt);
            }
        });
        Actual.add(ValorTotalActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 160, 30));

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel71.setText("Valor");
        Actual.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel72.setText("Valor total");
        Actual.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, -1));

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Actual.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        PrecioBaseActual.setEditable(false);
        PrecioBaseActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioBaseActualActionPerformed(evt);
            }
        });
        Actual.add(PrecioBaseActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 160, 30));

        AdicionalActual.setEditable(false);
        AdicionalActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdicionalActualActionPerformed(evt);
            }
        });
        Actual.add(AdicionalActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 160, 30));

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel74.setText("Agregado");
        Actual.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, -1, -1));

        ValorAgregadoActual.setEditable(false);
        ValorAgregadoActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValorAgregadoActualActionPerformed(evt);
            }
        });
        Actual.add(ValorAgregadoActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 160, 30));

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel75.setText("Precio base ");
        Actual.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        jPanel6.add(Actual, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 270, 380));

        tab.addTab("EDIT", jPanel6);

        jPanel1.add(tab, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 590, 520));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GSVMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GSVMouseEntered
     GSV.setBackground(new Color (204,204,204));
    }//GEN-LAST:event_GSVMouseEntered

    private void GSTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GSTMouseClicked
       tab.setSelectedIndex(1);
    }//GEN-LAST:event_GSTMouseClicked

    private void SACMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SACMouseClicked
         tab.setSelectedIndex(2);
    }//GEN-LAST:event_SACMouseClicked

    private void GSVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GSVMouseClicked
        tab.setSelectedIndex(0);
    }//GEN-LAST:event_GSVMouseClicked

    private void GSTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GSTMouseEntered
        GST.setBackground(new Color (204,204,204));
    }//GEN-LAST:event_GSTMouseEntered

    private void SACMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SACMouseEntered
        SAC.setBackground(new Color (204,204,204));
    }//GEN-LAST:event_SACMouseEntered

    private void GSVMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GSVMouseExited
       GSV.setBackground(new Color (153,153,153));
    }//GEN-LAST:event_GSVMouseExited

    private void GSTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GSTMouseExited
       GST.setBackground(new Color (153,153,153));
    }//GEN-LAST:event_GSTMouseExited

    private void SACMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SACMouseExited
        SAC.setBackground(new Color (153,153,153));
    }//GEN-LAST:event_SACMouseExited

    private void EliminarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarServicioActionPerformed
   int filaTabla = tablaServicios.getSelectedRow();
    
    if (filaTabla != -1) {
        int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea eliminar el servicio seleccionado?", "Confirmar", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            String nombreT = tablaServicios.getValueAt(filaTabla, 1).toString();
            int posicionEnLista = -1;
            for (int i = 0; i < ArregloServicios.lista.size(); i++) {
                if (ArregloServicios.lista.get(i).getNservicio().equals(nombreT) && 
                    ArregloServicios.lista.get(i).getCedulaProveedor().equals(CedulaSesion)) {
                    posicionEnLista = i;
                    break; 
                }
            }

            if (posicionEnLista != -1) {
                ControladorProveedor.eliminarServicio(posicionEnLista);
                ControladorProveedor.listarMisServicios(tablaServicios, CedulaSesion);
                JOptionPane.showMessageDialog(null, "Servicio eliminado correctamente.");
            }
        }
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, seleccione un servicio en la tabla.");
    }
    }//GEN-LAST:event_EliminarServicioActionPerformed

    private void EliminarServicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EliminarServicioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_EliminarServicioMouseClicked

    private void EditarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarServicioActionPerformed
    filaSeleccionada = tablaServicios.getSelectedRow();
    if (filaSeleccionada != -1) {
     
        CategoriaActual.setText(tablaServicios.getValueAt(filaSeleccionada, 0).toString());
        ServicioActual.setText(tablaServicios.getValueAt(filaSeleccionada, 1).toString());
        LocalidadActual.setText(tablaServicios.getValueAt(filaSeleccionada, 2).toString());
        ModalidadActual.setText(tablaServicios.getValueAt(filaSeleccionada, 3).toString());
        PrecioBaseActual.setText(tablaServicios.getValueAt(filaSeleccionada, 4).toString());
        AdicionalActual.setText(tablaServicios.getValueAt(filaSeleccionada, 5).toString());
        ValorAgregadoActual.setText(tablaServicios.getValueAt(filaSeleccionada, 6).toString());
        ValorTotalActual.setText(tablaServicios.getValueAt(filaSeleccionada, 7).toString());

        CategoriaNueva.setSelectedItem(tablaServicios.getValueAt(filaSeleccionada, 0).toString());
        ServicioNuevo.setText(tablaServicios.getValueAt(filaSeleccionada, 1).toString());
        LocalidadNueva.setText(tablaServicios.getValueAt(filaSeleccionada, 2).toString());
        PrecioBaseNuevo.setText(tablaServicios.getValueAt(filaSeleccionada, 4).toString());
        AdicionalNuevo.setSelectedItem(tablaServicios.getValueAt(filaSeleccionada, 5).toString());
        ValorAgregadoNuevo.setText(tablaServicios.getValueAt(filaSeleccionada, 6).toString());
        
    } else {
        JOptionPane.showMessageDialog(null, "Por favor, selecciona un servicio en la tabla.");
    }
    }//GEN-LAST:event_EditarServicioActionPerformed

    private void EditarServicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditarServicioMouseClicked
   tab.setSelectedIndex(5);      
    }//GEN-LAST:event_EditarServicioMouseClicked

    private void CrearServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearServicioActionPerformed
    String n = txtNombre.getText().trim();
    String l = txtLocalidad.getText().trim();
    String c = cbxCategoria.getSelectedItem().toString();
    String ad = cbxAdicional.getSelectedItem().toString();
    String mod = cbxModalidad.getSelectedItem().toString();
    if (n.isEmpty() || l.isEmpty() || c.equals("Seleccione") || mod.equals("Seleccione")) {
        JOptionPane.showMessageDialog(null, "Debe llenar Nombre, Localidad, Categoría y Modalidad obligatoriamente.");
        return; 
    }
    double va = 0;
    double precioBase = 0;

    try {
        if (!txtValorAgregado.getText().isEmpty()) {
            va = Double.parseDouble(txtValorAgregado.getText());
        }

        Servicio nuevo = null;

        if (mod.equals("Por Hora")) {
            if (txtValorHora.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar el valor por hora.");
                return;
            }
            precioBase = Double.parseDouble(txtValorHora.getText());
            nuevo = new ServicioPorHora(n, c, l, CedulaSesion, ad, va, precioBase);
            
        } else if (mod.equals("Tarifa Fija")) {
            if (txtTarifaFija.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Debe ingresar la tarifa fija.");
                return;
            }
            precioBase = Double.parseDouble(txtTarifaFija.getText());
            nuevo = new ServicioFijo(n, c, l, CedulaSesion, ad, va, precioBase);
        }
        if (nuevo != null) {
            ControladorProveedor.agregarServicio(nuevo);
            ControladorProveedor.listarMisServicios(tablaServicios, CedulaSesion);
            limpiarCampos();
        }

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Ingrese valores numericos validos en los valores.");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Ocurrió un error inesperado.");
    }
    }//GEN-LAST:event_CrearServicioActionPerformed

    private void CrearServicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearServicioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CrearServicioMouseClicked

    private void txtLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocalidadActionPerformed

    private void AceptarSoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarSoliActionPerformed

    }//GEN-LAST:event_AceptarSoliActionPerformed

    private void AceptarSoliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AceptarSoliMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_AceptarSoliMouseClicked

    private void rechazarSoliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rechazarSoliActionPerformed

    }//GEN-LAST:event_rechazarSoliActionPerformed

    private void rechazarSoliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rechazarSoliMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_rechazarSoliMouseClicked

    private void MisSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MisSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MisSActionPerformed

    private void MisSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MisSMouseClicked
        tab.setSelectedIndex(4);
    }//GEN-LAST:event_MisSMouseClicked

    private void crearSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearSActionPerformed

    private void crearSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearSMouseClicked
        tab.setSelectedIndex(3);
    }//GEN-LAST:event_crearSMouseClicked

    private void ServicioNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServicioNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ServicioNuevoActionPerformed

    private void actualizarServicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarServicioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarServicioMouseClicked

    private void actualizarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarServicioActionPerformed
        try {
        String nom = ServicioNuevo.getText();
        String loc = LocalidadNueva.getText();
        String adi = AdicionalNuevo.getSelectedItem().toString(); 
        String cat = CategoriaNueva.getSelectedItem().toString();
        double pre = Double.parseDouble(PrecioBaseNuevo.getText());
        double vag = Double.parseDouble(ValorAgregadoNuevo.getText());
        ControladorProveedor.actualizarServicio(filaSeleccionada, nom, loc, adi, pre, vag, cat);
        ControladorProveedor.listarMisServicios(tablaServicios, CedulaSesion);
        JOptionPane.showMessageDialog(null, "Servicio actualizado correctamente!");
        ControladorProveedor.listarMisServicios(tablaServicios, CedulaSesion);
        tab.setSelectedIndex(4); 
        

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Revisa los precios ingresados.");
    }
    }//GEN-LAST:event_actualizarServicioActionPerformed

    private void finalizarServicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_finalizarServicioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_finalizarServicioMouseClicked

    private void finalizarServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarServicioActionPerformed

    }//GEN-LAST:event_finalizarServicioActionPerformed

    private void LocalidadActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocalidadActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocalidadActualActionPerformed

    private void txtValorHoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorHoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorHoraActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void cbxCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxCategoriaActionPerformed

    private void txtValorAgregadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorAgregadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorAgregadoActionPerformed

    private void ServicioActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ServicioActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ServicioActualActionPerformed

    private void CategoriaActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriaActualActionPerformed

    private void PrecioBaseNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioBaseNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioBaseNuevoActionPerformed

    private void cbxAdicionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxAdicionalActionPerformed
    String seleccion = cbxAdicional.getSelectedItem().toString();
    if (seleccion.equals("Ninguno")) {
        txtValorAgregado.setText("0");
        txtValorAgregado.setEditable(false); 
    } else {
        txtValorAgregado.setEditable(true);  
        txtValorAgregado.setText("");        
        txtValorAgregado.requestFocus(); 
    }
    }//GEN-LAST:event_cbxAdicionalActionPerformed

    private void txtTarifaFijaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTarifaFijaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTarifaFijaActionPerformed

    private void cbxModalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxModalidadActionPerformed
    String selec = cbxModalidad.getSelectedItem().toString();
    if (selec.equals("Por Hora")) {
        txtValorHora.setEditable(true);    
        txtTarifaFija.setEditable(false);  
        txtTarifaFija.setText("");         
    } else if (selec.equals("Tarifa Fija")) {
        txtTarifaFija.setEditable(true);   
        txtValorHora.setEditable(false);  
        txtValorHora.setText("");    
    } else if(selec.equals("Seleccione")) {
        txtValorHora.setEditable(false);
        txtTarifaFija.setEditable(false);
    }
    }//GEN-LAST:event_cbxModalidadActionPerformed

    private void CategoriaNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CategoriaNuevaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CategoriaNuevaActionPerformed

    private void ModalidadActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModalidadActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ModalidadActualActionPerformed

    private void ValorTotalActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorTotalActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorTotalActualActionPerformed

    private void tablaServiciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaServiciosMouseClicked
      filaSeleccionada = tablaServicios.getSelectedRow();
    }//GEN-LAST:event_tablaServiciosMouseClicked

    private void PrecioBaseActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioBaseActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioBaseActualActionPerformed

    private void AdicionalActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionalActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AdicionalActualActionPerformed

    private void ValorAgregadoActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorAgregadoActualActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorAgregadoActualActionPerformed

    private void LocalidadNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocalidadNuevaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LocalidadNuevaActionPerformed

    private void ValorAgregadoNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValorAgregadoNuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValorAgregadoNuevoActionPerformed

    private void AdicionalNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdicionalNuevoActionPerformed
     String seleccion = AdicionalNuevo.getSelectedItem().toString();
    if (seleccion.equals("Ninguno")) {
        ValorAgregadoNuevo.setText("0");
        ValorAgregadoNuevo.setEditable(false); 
    } else {
        ValorAgregadoNuevo.setEditable(true);
    }
    }//GEN-LAST:event_AdicionalNuevoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarSoli;
    private javax.swing.JPanel Actual;
    private javax.swing.JTextField AdicionalActual;
    private javax.swing.JComboBox<String> AdicionalNuevo;
    private javax.swing.JTextField CategoriaActual;
    private javax.swing.JComboBox<String> CategoriaNueva;
    private javax.swing.JButton CrearServicio;
    private javax.swing.JButton EditarServicio;
    private javax.swing.JButton EliminarServicio;
    private javax.swing.JPanel GST;
    private javax.swing.JPanel GSV;
    private javax.swing.JTextField LocalidadActual;
    private javax.swing.JTextField LocalidadNueva;
    private javax.swing.JButton MisS;
    private javax.swing.JTextField ModalidadActual;
    private javax.swing.JTextField PrecioBaseActual;
    private javax.swing.JTextField PrecioBaseNuevo;
    private javax.swing.JPanel SAC;
    private javax.swing.JTextField ServicioActual;
    private javax.swing.JTextField ServicioNuevo;
    private javax.swing.JTextField ValorAgregadoActual;
    private javax.swing.JTextField ValorAgregadoNuevo;
    private javax.swing.JTextField ValorTotalActual;
    private javax.swing.JButton actualizarServicio;
    private javax.swing.JComboBox<String> cbxAdicional;
    private javax.swing.JComboBox<String> cbxCategoria;
    private javax.swing.JComboBox<String> cbxModalidad;
    private javax.swing.JButton crearS;
    private javax.swing.JButton finalizarServicio;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JButton rechazarSoli;
    private javax.swing.JTabbedPane tab;
    private javax.swing.JTable tablaActivos;
    public javax.swing.JTable tablaServicios;
    private javax.swing.JTable tablaSoli;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTarifaFija;
    private javax.swing.JTextField txtValorAgregado;
    private javax.swing.JTextField txtValorHora;
    // End of variables declaration//GEN-END:variables
}
