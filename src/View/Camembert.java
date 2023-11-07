/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.Color;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JPanel;
import model.Data;
import model.Passager;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author lycee
 */
public class Camembert extends AbstractPano{
    private ArrayList<Passager> listPass;
    public Camembert(){
        super();
        listPass = new Data().getData();
        //this.setPreferredSize(new Dimension(200, 200));
        //this.setBackground(Color.red);
        // create a dataset...
        //final PieDataset dataset = createSampleDataset();
        
        // create the chart...
        //final JFreeChart chart = createChart(dataset);
        
        // add the chart to a panel...
        //final ChartPanel chartPanel = new ChartPanel(chart);
        //chartPanel.setPreferredSize(new java.awt.Dimension(500, 270));
        //chartPanel.setBackground(Color.red);
        this.add(createDemoPanel(listPass));
    } 
    
    private static PieDataset createSampleDataset(ArrayList<Passager> listPass) {
        
        int f = 0, h = 0;
        
        for (Passager pers: listPass){
            if (pers.getSexe() == 0){
                f++;
            }else{
                h++;
            }
        }
        
        final DefaultPieDataset dataset = new DefaultPieDataset();
        dataset.setValue("Homme",h );
        dataset.setValue("Femme", f);
        return dataset;
        
    }
    
    
    
    private static JFreeChart createChart(final PieDataset dataset) {
        
        final JFreeChart chart = ChartFactory.createPieChart3D(
            "Titanc",  // chart title
            dataset,                // data
            true,                   // include legend
            true,
            false
        );

        final PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(290);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.9f);
        plot.setNoDataMessage("No data to display");
        
        return chart;
    }
    
     public static JPanel createDemoPanel(ArrayList<Passager> listPass) {
      JFreeChart chart = createChart(createSampleDataset(listPass) );  
      return new ChartPanel( chart ); 
   }

}
    