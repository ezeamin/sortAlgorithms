package algoritmos;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.chart.renderer.category.StandardBarPainter;

/**
 *
 * @author EZEA2
 */
public class GUIGrafico extends javax.swing.JFrame {

    /**
     * Creates new form GUIGrafico
     */
    String datos[][];

    public GUIGrafico(String _datos[][]) {
        initComponents();
        FlatLightLaf.setup();
        //setLocationRelativeTo(null);

        datos=new String[5][7];
        for(int i=0;i<5;i++){
            System.arraycopy(_datos[i], 0, datos[i], 0, 7);
        }

        DefaultCategoryDataset dod = new DefaultCategoryDataset();
        for(int i=0;i<7;i++){
            if(datos[1][i]!=null) dod.setValue(Double.parseDouble(datos[2][i]),"Comparaciones",datos[0][i]);   
        }

        JFreeChart jchart = ChartFactory.createBarChart("Rendimiento","Algoritmos","Cantidad de comparaciones",dod,PlotOrientation.VERTICAL,true,true,false);

        CategoryPlot plot = jchart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.gray);

        ChartFrame chartFrm = new ChartFrame("Rendimiento",jchart,true);
        //chartFrm.setVisible(true);
        chartFrm.setSize(300, 200);

        ((BarRenderer)plot.getRenderer()).setBarPainter(new StandardBarPainter());

        BarRenderer r = (BarRenderer)jchart.getCategoryPlot().getRenderer();
        r.setSeriesPaint(0, Color.red);

        ChartPanel chartPanel = new ChartPanel(jchart);
        panelResultadosComp.removeAll();
        panelResultadosComp.add(chartPanel);
        panelResultadosComp.updateUI();

        //

        dod = new DefaultCategoryDataset();
        for(int i=0;i<7;i++){ 
            if(datos[1][i]!=null) dod.setValue(Double.parseDouble(datos[1][i]),"Tiempo",datos[0][i]);
        }

        jchart = ChartFactory.createBarChart("Rendimiento","Algoritmos","Tiempo [s]",dod,PlotOrientation.VERTICAL,true,true,false);

        plot = jchart.getCategoryPlot();
        plot.setRangeGridlinePaint(Color.gray);

        chartFrm = new ChartFrame("Rendimiento",jchart,true);
        //chartFrm.setVisible(true);
        chartFrm.setSize(300, 200);

        ((BarRenderer)plot.getRenderer()).setBarPainter(new StandardBarPainter());

        r = (BarRenderer)jchart.getCategoryPlot().getRenderer();
        r.setSeriesPaint(0, Color.blue);

        chartPanel = new ChartPanel(jchart);
        panelResultadosTiempo.removeAll();
        panelResultadosTiempo.add(chartPanel);
        panelResultadosTiempo.updateUI();


    }

    /**
     * Creates a sample dataset.
     *
     * @return  The dataset.
     */


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        panelResultadosComp = new javax.swing.JPanel();
        btnCerrar = new javax.swing.JButton();
        panelResultadosTiempo = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Graficos");
        setMaximumSize(new java.awt.Dimension(900, 900));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setUndecorated(false);
        setPreferredSize(new java.awt.Dimension(700, 850));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Grafica de resultados");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 19, -1, -1));

        panelResultadosComp.setBorder(btnCerrar.getBorder());
        panelResultadosComp.setLayout(new javax.swing.BoxLayout(panelResultadosComp, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(panelResultadosComp, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 63, 634, 331));

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 773, -1, -1));

        panelResultadosTiempo.setBorder(btnCerrar.getBorder());
        panelResultadosTiempo.setLayout(new javax.swing.BoxLayout(panelResultadosTiempo, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(panelResultadosTiempo, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 406, 634, 349));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 790, 10, 20));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelResultadosComp;
    private javax.swing.JPanel panelResultadosTiempo;
    // End of variables declaration//GEN-END:variables
}