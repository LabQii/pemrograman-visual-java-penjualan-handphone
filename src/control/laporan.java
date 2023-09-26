/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import control.koneksi;
import gui.FormUtama;
import gui.Transaksi;
import gui.frmLaporan;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dialog;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Acer
 */
public class laporan extends koneksi{
 Connection con;
 
 
    public laporan(){
       super.setKoneksi();
    }
    
    public void tampailBarangTerjual(){
     try {
         String sql = "SELECT SUM(qty) FROM barangpenjualan";
         rs = st.executeQuery(sql);
         while(rs.next()){
             frmLaporan.brgTerjual.setText(Integer.toString(rs.getInt(1)));
         }
     } catch (SQLException ex) {
         Logger.getLogger(laporan.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    
    public void tampilTotal(){
     try {
         String sql = "SELECT SUM(total) FROM penjualan";
         rs = st.executeQuery(sql);
         while(rs.next()){
             frmLaporan.txTotal.setText(Integer.toString(rs.getInt(1)));
         }
     } catch (SQLException ex) {
         Logger.getLogger(laporan.class.getName()).log(Level.SEVERE, null, ex);
     }
    }
    
      public void printNota(String nofak) {
        JasperReport jasRep;
        JasperPrint jasPri;
        JasperDesign jasdes;
        Map<String, Object> param = new HashMap<String, Object>();
        
    try {
        Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemkasir","root","");
         File report = new File("./report/ASW.jrxml");
         param.put("nofak", nofak);
         jasdes = JRXmlLoader.load(report);
         jasRep = JasperCompileManager.compileReport(jasdes);
         jasPri = JasperFillManager.fillReport(jasRep,param, con);
//         JasperViewer.viewReport(jasPri,false);
          JasperViewer jasperViewer = new JasperViewer(jasPri, false);
           JDialog dialog = new JDialog();//the owner
            dialog.setContentPane(jasperViewer.getContentPane());
            dialog.setSize(jasperViewer.getSize());
            dialog.setTitle("NOTA");
            dialog.setAlwaysOnTop(true);
            dialog.setModalityType(Dialog.ModalityType.MODELESS);
            dialog.setModal(true);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(FormUtama.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(FormUtama.class.getName()).log(Level.SEVERE, null, ex);
    } catch (JRException ex) {
        Logger.getLogger(FormUtama.class.getName()).log(Level.SEVERE, null, ex);
    }

      } 
    
      public void printLaporan(String tgl) {
        JasperReport jasRep;
        JasperPrint jasPri;
        JasperDesign jasdes;
        Map<String, Object> param = new HashMap<String, Object>();
        
    try {
        Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemkasir","root","");
         File report = new File("./report/report5.jrxml");
         param.put("tgl", tgl);
         jasdes = JRXmlLoader.load(report);
         jasRep = JasperCompileManager.compileReport(jasdes);
         jasPri = JasperFillManager.fillReport(jasRep,param, con);
//         JasperViewer.viewReport(jasPri,false);
          JasperViewer jasperViewer = new JasperViewer(jasPri, false);
           JDialog dialog = new JDialog();//the owner
            dialog.setContentPane(jasperViewer.getContentPane());
            dialog.setSize(jasperViewer.getSize());
            dialog.setTitle("NOTA");
            dialog.setAlwaysOnTop(true);
            dialog.setModalityType(Dialog.ModalityType.MODELESS);
            dialog.setModal(true);
            dialog.setLocationRelativeTo(null);
            dialog.setVisible(true);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(FormUtama.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(FormUtama.class.getName()).log(Level.SEVERE, null, ex);
    } catch (JRException ex) {
        Logger.getLogger(FormUtama.class.getName()).log(Level.SEVERE, null, ex);
    }

      } 

}



