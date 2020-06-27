/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TimerTask;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;

/**
 *
 * @author rajan
 */
public class question1 extends javax.swing.JFrame {

    /**
     * Creates new form question1
     */
    int hour,minute,second;
    public int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12;
    public question1() {
        initComponents();
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanel4.setVisible(false);
        jPanel2.setVisible(false);
        jPanel9.setVisible(false);
        jPanel10.setVisible(false);
        jPanel11.setVisible(false);
        jPanel14.setVisible(false);
        jPanel15.setVisible(false);
        jPanel16.setVisible(false);
        jPanel17.setVisible(false);
       
        
        java.util.Timer timer = new java.util.Timer(); 
            hour=1;
         minute = 59; 
                second=59;
        TimerTask task = new TimerTask() {         
            @Override
            public void run() {            
               
                min.setText(Integer.toString(minute));
                sec.setText(Integer.toString(second));
                h.setText(Integer.toString(hour));
                        
                second--;
                //minute--;
                if(second==0)
                {
                    second=59;
                    minute--;
                    
                }
                if(minute==0)
                {
                    minute=59;
                    hour--;
                }
                 if(hour<0)
                    {
                       dispose();
                    }
            }
        };
       
    timer.scheduleAtFixedRate(task, 1000, 1000); 
     int qs=1;
        
        try
        {
            
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mock", "root", "tiger");
            Statement st= con.createStatement();
            String Query="select * from quest where qset='"+qs+"'";
            
            PreparedStatement ps=con.prepareStatement(Query);
            
            ResultSet rs=ps.executeQuery();
            
            if(rs.next())
            {
                String ques=rs.getString(1);
                q.setText(ques);
                String o1=rs.getString(2);
                op1.setText(o1);
                jRadioButton1.setActionCommand("1");
                String o2=rs.getString(3);
                op2.setText(o2);
                jRadioButton2.setActionCommand("2");
                String o3=rs.getString(4);
                op3.setText(o3);
                jRadioButton3.setActionCommand("3");
                String o4=rs.getString(5);
                op4.setText(o4);
                jRadioButton4.setActionCommand("4");
                String qset=rs.getString(7);
                qn.setText(qset);
                
                int marks=rs.getInt(8);
                qn2.setText("Marks: "+marks);
                qn1.setText("Question Set: "+qs); //ending of 1st panel
//                if(g1==marks)
//                {
//                    num=1;
//                    JOptionPane.showMessageDialog(null, num);
//                }
            }
//            else
//            {
//                //JOptionPane.showMessageDialog(null, "Something went wrong");
//            }
        }
        catch(ClassNotFoundException | SQLException e)
        {

        }
    }
    
    void question1(int qs,int i)
    {
        int a=qs;
        int b=i;
        
         try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mock", "root", "tiger");
            Statement st= con.createStatement();
            String Query="select * from quest where qn='"+b+"'" ;
            
            PreparedStatement ps=con.prepareStatement(Query);
            
            ResultSet rs=ps.executeQuery();
            
            if(rs.next())
            {
              String ques2=rs.getString(1); //Starting of second panel
                q3.setText(ques2);
                String o12=rs.getString(2);
                op12.setText(o12);
                jRadioButton13.setActionCommand("1");
                String o22=rs.getString(3);
                op2_2.setText(o22);
                jRadioButton14.setActionCommand("2");
                String o32=rs.getString(4);
                op32.setText(o32);
                jRadioButton15.setActionCommand("3");
                String o42=rs.getString(5);
                op16.setText(o42);
                jRadioButton16.setActionCommand("4");
                //String qse2=rs.getString(7);
                qnp2.setText("2");
                String mark2=rs.getString(8);
                marks2.setText("Marks: "+mark2);
                qset2.setText("Question Set: "+qs);  
                
                String ques3=rs.getString(1); //Starting of third panel
                q4.setText(ques3);
                String o13=rs.getString(2);
                op13.setText(o13);
                jRadioButton17.setActionCommand("1");
                String o23=rs.getString(3);
                op2_3.setText(o23);
                jRadioButton18.setActionCommand("2");
                String o33=rs.getString(4);
                op33.setText(o33);
                jRadioButton19.setActionCommand("3");
                String o43=rs.getString(5);
                op43.setText(o43);
                jRadioButton20.setActionCommand("4");
                //String qse2=rs.getString(7);
                qnp3.setText(""+b);
                String mark3=rs.getString(8);
                marks3.setText("Marks: "+mark2);
                qset3.setText("Question Set: "+qs);  
                
                String ques4=rs.getString(1); //Starting of fourth panel
                q2.setText(ques4);
                String o14=rs.getString(2);
                op14.setText(o14);
                jRadioButton9.setActionCommand("1");
                String o24=rs.getString(3);
                op_24.setText(o24);
                jRadioButton10.setActionCommand("2");
                String o34=rs.getString(4);
                op34.setText(o34);
                jRadioButton11.setActionCommand("3");
                String o44=rs.getString(5);
                op44.setText(o44);
                jRadioButton12.setActionCommand("4");
                //String qse2=rs.getString(7);
                qn4.setText(""+b);
                String mark4=rs.getString(8);
                marks4.setText("Marks: "+mark4);
                qs4.setText("Question Set: "+qs);  
                
                String ques5=rs.getString(1); //Starting of fifth panel
                q1.setText(ques5);
                String o15=rs.getString(2);
                op_15.setText(o15);
                jRadioButton5.setActionCommand("1");
                String o25=rs.getString(3);
                op25.setText(o25);
                jRadioButton6.setActionCommand("2");
                String o35=rs.getString(4);
                op_35.setText(o35);
                jRadioButton7.setActionCommand("3");
                String o45=rs.getString(5);
                op45.setText(o45);
                jRadioButton8.setActionCommand("4");
                //String qse2=rs.getString(7);
                qn3.setText(""+b);
                String mark5=rs.getString(8);
                marks5.setText("Marks: "+mark5);
                qs5.setText("Question Set: "+qs);  
                
                String ques6=rs.getString(1); //Starting of sixth panel
                q7.setText(ques6);
                String o16=rs.getString(2);
                op_16.setText(o16);
                jRadioButton29.setActionCommand("1");
                String o26=rs.getString(3);
                op26.setText(o26);
                jRadioButton30.setActionCommand("2");
                String o36=rs.getString(4);
                op36.setText(o36);
                jRadioButton31.setActionCommand("3");
                String o46=rs.getString(5);
                op46.setText(o46);
                jRadioButton32.setActionCommand("4");
                //String qse2=rs.getString(7);
                qn7.setText(""+b);
                String mark6=rs.getString(8);
                marks6.setText("Marks: "+mark6);
                qs6.setText("Question Set: "+qs);  
                
                String ques7=rs.getString(1); //Starting of seventh panel
                q8.setText(ques7);
                String o17=rs.getString(2);
                op17.setText(o17);
                jRadioButton33.setActionCommand("1");
                String o27=rs.getString(3);
                op27.setText(o27);
                jRadioButton34.setActionCommand("2");
                String o37=rs.getString(4);
                op37.setText(o37);
                jRadioButton35.setActionCommand("3");
                String o47=rs.getString(5);
                op20.setText(o47);
                jRadioButton36.setActionCommand("4");
                //String qse2=rs.getString(7);
                qn10.setText(""+b);
                String mark7=rs.getString(8);
                qn12.setText("Marks: "+mark7);
                qn11.setText("Question Set: "+qs);  
                
                String ques8=rs.getString(1); //Starting of eight panel
                q9.setText(ques8);
                String o18=rs.getString(2);
                op18.setText(o18);
                jRadioButton37.setActionCommand("1");
                String o28=rs.getString(3);
                op_28.setText(o28);
                jRadioButton38.setActionCommand("2");
                String o38=rs.getString(4);
                op38.setText(o38);
                jRadioButton39.setActionCommand("3");
                String o48=rs.getString(5);
                op_48.setText(o48);
                jRadioButton40.setActionCommand("4");
                //String qse2=rs.getString(7);
                qn13.setText(""+b);
                String mark8=rs.getString(8);
                marks8.setText("Marks: "+mark8);
                qs8.setText("Question Set: "+qs);  
                
                String ques9=rs.getString(1); //Starting of nineth panel
                q12.setText(ques9);
                String o19=rs.getString(2);
                op18.setText(o19);
                jRadioButton49.setActionCommand("1");
                String o29=rs.getString(3);
                op_28.setText(o29);
                jRadioButton50.setActionCommand("2");
                String o39=rs.getString(4);
                op38.setText(o39);
                jRadioButton51.setActionCommand("3");
                String o49=rs.getString(5);
                op_48.setText(o49);
                jRadioButton52.setActionCommand("4");
                //String qse2=rs.getString(7);
                qn16.setText(""+b);
                String mark9=rs.getString(8);
                marks9.setText("Marks: "+mark9);
                qs11.setText("Question Set: "+qs);
                
                String ques10=rs.getString(1); //Starting of tenth panel
                q13.setText(ques9);
                String o110=rs.getString(2);
                op110.setText(o19);
                jRadioButton53.setActionCommand("1");
                String o210=rs.getString(3);
                op210.setText(o29);
                jRadioButton54.setActionCommand("2");
                String o310=rs.getString(4);
                op310.setText(o39);
                jRadioButton55.setActionCommand("3");
                String o410=rs.getString(5);
                op410.setText(o49);
                jRadioButton56.setActionCommand("4");
                //String qse2=rs.getString(7);
                qn17.setText(""+b);
                String mark10=rs.getString(8);
                marks10.setText("Marks: "+mark10);
                qs12.setText("Question Set: "+qs);  
                
                String ques11=rs.getString(1); //Starting of eleventh panel
                q14.setText(ques11);
                String o111=rs.getString(2);
                op111.setText(o111);
                jRadioButton57.setActionCommand("1");
                String o211=rs.getString(3);
                op211.setText(o211);
                jRadioButton58.setActionCommand("2");
                String o311=rs.getString(4);
                op311.setText(o311);
                jRadioButton59.setActionCommand("3");
                String o411=rs.getString(5);
                op411.setText(o411);
                jRadioButton60.setActionCommand("4");
                //String qse2=rs.getString(7);
                qn18.setText(""+b);
                String mark11=rs.getString(8);
                marks11.setText("Marks: "+mark11);
                qs13.setText("Question Set: "+qs);
                
                String ques12=rs.getString(1); //Starting of tweleth panel
                q15.setText(ques12);
                String o112=rs.getString(2);
                op112.setText(o111);
                jRadioButton61.setActionCommand("1");
                String o212=rs.getString(3);
                op212.setText(o211);
                jRadioButton62.setActionCommand("2");
                String o312=rs.getString(4);
                op312.setText(o311);
                jRadioButton63.setActionCommand("3");
                String o412=rs.getString(5);
                op412.setText(o411);
                jRadioButton64.setActionCommand("4");
                //String qse2=rs.getString(7);
                qn19.setText(""+b);
                String mark12=rs.getString(8);
                marks11.setText("Marks: "+mark12);
                qs14.setText("Question Set: "+qs);
                
            }
            else if(rs.next()==false)
            {
                
                JOptionPane.showMessageDialog(null, "over");
               // dispose();
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {

        }
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        buttonGroup12 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jPanel42 = new javax.swing.JPanel();
        min = new javax.swing.JLabel();
        sec = new javax.swing.JLabel();
        h = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        q = new javax.swing.JTextArea();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        qn = new javax.swing.JTextField();
        qn1 = new javax.swing.JTextField();
        qn2 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        op1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        op2 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        op3 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        op4 = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jButton6 = new javax.swing.JButton();
        jScrollPane16 = new javax.swing.JScrollPane();
        q3 = new javax.swing.JTextArea();
        jRadioButton13 = new javax.swing.JRadioButton();
        jRadioButton14 = new javax.swing.JRadioButton();
        jRadioButton15 = new javax.swing.JRadioButton();
        jRadioButton16 = new javax.swing.JRadioButton();
        qnp2 = new javax.swing.JTextField();
        qset2 = new javax.swing.JTextField();
        marks2 = new javax.swing.JTextField();
        jScrollPane17 = new javax.swing.JScrollPane();
        op12 = new javax.swing.JTextArea();
        jScrollPane18 = new javax.swing.JScrollPane();
        op2_2 = new javax.swing.JTextArea();
        jScrollPane19 = new javax.swing.JScrollPane();
        op32 = new javax.swing.JTextArea();
        jScrollPane20 = new javax.swing.JScrollPane();
        op16 = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jScrollPane21 = new javax.swing.JScrollPane();
        q4 = new javax.swing.JTextArea();
        jRadioButton17 = new javax.swing.JRadioButton();
        jRadioButton18 = new javax.swing.JRadioButton();
        jRadioButton19 = new javax.swing.JRadioButton();
        jRadioButton20 = new javax.swing.JRadioButton();
        qnp3 = new javax.swing.JTextField();
        qset3 = new javax.swing.JTextField();
        marks3 = new javax.swing.JTextField();
        jScrollPane22 = new javax.swing.JScrollPane();
        op13 = new javax.swing.JTextArea();
        jScrollPane23 = new javax.swing.JScrollPane();
        op2_3 = new javax.swing.JTextArea();
        jScrollPane24 = new javax.swing.JScrollPane();
        op33 = new javax.swing.JTextArea();
        jScrollPane25 = new javax.swing.JScrollPane();
        op43 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        q2 = new javax.swing.JTextArea();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        qn4 = new javax.swing.JTextField();
        qs4 = new javax.swing.JTextField();
        marks4 = new javax.swing.JTextField();
        jScrollPane12 = new javax.swing.JScrollPane();
        op14 = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        op_24 = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        op34 = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        op44 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jScrollPane6 = new javax.swing.JScrollPane();
        q1 = new javax.swing.JTextArea();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        qn3 = new javax.swing.JTextField();
        qs5 = new javax.swing.JTextField();
        marks5 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        op_15 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        op25 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        op_35 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        op45 = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        jButton10 = new javax.swing.JButton();
        jScrollPane36 = new javax.swing.JScrollPane();
        q7 = new javax.swing.JTextArea();
        jRadioButton29 = new javax.swing.JRadioButton();
        jRadioButton30 = new javax.swing.JRadioButton();
        jRadioButton31 = new javax.swing.JRadioButton();
        jRadioButton32 = new javax.swing.JRadioButton();
        qn7 = new javax.swing.JTextField();
        qs6 = new javax.swing.JTextField();
        marks6 = new javax.swing.JTextField();
        jScrollPane37 = new javax.swing.JScrollPane();
        op_16 = new javax.swing.JTextArea();
        jScrollPane38 = new javax.swing.JScrollPane();
        op26 = new javax.swing.JTextArea();
        jScrollPane39 = new javax.swing.JScrollPane();
        op36 = new javax.swing.JTextArea();
        jScrollPane40 = new javax.swing.JScrollPane();
        op46 = new javax.swing.JTextArea();
        jPanel10 = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jScrollPane41 = new javax.swing.JScrollPane();
        q8 = new javax.swing.JTextArea();
        jRadioButton33 = new javax.swing.JRadioButton();
        jRadioButton34 = new javax.swing.JRadioButton();
        jRadioButton35 = new javax.swing.JRadioButton();
        jRadioButton36 = new javax.swing.JRadioButton();
        qn10 = new javax.swing.JTextField();
        qn11 = new javax.swing.JTextField();
        qn12 = new javax.swing.JTextField();
        jScrollPane42 = new javax.swing.JScrollPane();
        op17 = new javax.swing.JTextArea();
        jScrollPane43 = new javax.swing.JScrollPane();
        op27 = new javax.swing.JTextArea();
        jScrollPane44 = new javax.swing.JScrollPane();
        op37 = new javax.swing.JTextArea();
        jScrollPane45 = new javax.swing.JScrollPane();
        op20 = new javax.swing.JTextArea();
        jPanel11 = new javax.swing.JPanel();
        jButton12 = new javax.swing.JButton();
        jScrollPane46 = new javax.swing.JScrollPane();
        q9 = new javax.swing.JTextArea();
        jRadioButton37 = new javax.swing.JRadioButton();
        jRadioButton38 = new javax.swing.JRadioButton();
        jRadioButton39 = new javax.swing.JRadioButton();
        jRadioButton40 = new javax.swing.JRadioButton();
        qn13 = new javax.swing.JTextField();
        qs8 = new javax.swing.JTextField();
        marks8 = new javax.swing.JTextField();
        jScrollPane47 = new javax.swing.JScrollPane();
        op18 = new javax.swing.JTextArea();
        jScrollPane48 = new javax.swing.JScrollPane();
        op_28 = new javax.swing.JTextArea();
        jScrollPane49 = new javax.swing.JScrollPane();
        op38 = new javax.swing.JTextArea();
        jScrollPane50 = new javax.swing.JScrollPane();
        op_48 = new javax.swing.JTextArea();
        jPanel14 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        jScrollPane61 = new javax.swing.JScrollPane();
        q12 = new javax.swing.JTextArea();
        jRadioButton49 = new javax.swing.JRadioButton();
        jRadioButton50 = new javax.swing.JRadioButton();
        jRadioButton51 = new javax.swing.JRadioButton();
        jRadioButton52 = new javax.swing.JRadioButton();
        qn16 = new javax.swing.JTextField();
        qs11 = new javax.swing.JTextField();
        marks9 = new javax.swing.JTextField();
        jScrollPane62 = new javax.swing.JScrollPane();
        op22 = new javax.swing.JTextArea();
        jScrollPane63 = new javax.swing.JScrollPane();
        op41 = new javax.swing.JTextArea();
        jScrollPane64 = new javax.swing.JScrollPane();
        op42 = new javax.swing.JTextArea();
        jScrollPane65 = new javax.swing.JScrollPane();
        op47 = new javax.swing.JTextArea();
        jPanel15 = new javax.swing.JPanel();
        jButton16 = new javax.swing.JButton();
        jScrollPane66 = new javax.swing.JScrollPane();
        q13 = new javax.swing.JTextArea();
        jRadioButton53 = new javax.swing.JRadioButton();
        jRadioButton54 = new javax.swing.JRadioButton();
        jRadioButton55 = new javax.swing.JRadioButton();
        jRadioButton56 = new javax.swing.JRadioButton();
        qn17 = new javax.swing.JTextField();
        qs12 = new javax.swing.JTextField();
        marks10 = new javax.swing.JTextField();
        jScrollPane67 = new javax.swing.JScrollPane();
        op110 = new javax.swing.JTextArea();
        jScrollPane68 = new javax.swing.JScrollPane();
        op210 = new javax.swing.JTextArea();
        jScrollPane69 = new javax.swing.JScrollPane();
        op310 = new javax.swing.JTextArea();
        jScrollPane70 = new javax.swing.JScrollPane();
        op410 = new javax.swing.JTextArea();
        jPanel16 = new javax.swing.JPanel();
        jButton17 = new javax.swing.JButton();
        jScrollPane71 = new javax.swing.JScrollPane();
        q14 = new javax.swing.JTextArea();
        jRadioButton57 = new javax.swing.JRadioButton();
        jRadioButton58 = new javax.swing.JRadioButton();
        jRadioButton59 = new javax.swing.JRadioButton();
        jRadioButton60 = new javax.swing.JRadioButton();
        qn18 = new javax.swing.JTextField();
        qs13 = new javax.swing.JTextField();
        marks11 = new javax.swing.JTextField();
        jScrollPane72 = new javax.swing.JScrollPane();
        op111 = new javax.swing.JTextArea();
        jScrollPane73 = new javax.swing.JScrollPane();
        op211 = new javax.swing.JTextArea();
        jScrollPane74 = new javax.swing.JScrollPane();
        op311 = new javax.swing.JTextArea();
        jScrollPane75 = new javax.swing.JScrollPane();
        op411 = new javax.swing.JTextArea();
        jPanel17 = new javax.swing.JPanel();
        jButton18 = new javax.swing.JButton();
        jScrollPane76 = new javax.swing.JScrollPane();
        q15 = new javax.swing.JTextArea();
        jRadioButton61 = new javax.swing.JRadioButton();
        jRadioButton62 = new javax.swing.JRadioButton();
        jRadioButton63 = new javax.swing.JRadioButton();
        jRadioButton64 = new javax.swing.JRadioButton();
        qn19 = new javax.swing.JTextField();
        qs14 = new javax.swing.JTextField();
        marks12 = new javax.swing.JTextField();
        jScrollPane77 = new javax.swing.JScrollPane();
        op112 = new javax.swing.JTextArea();
        jScrollPane78 = new javax.swing.JScrollPane();
        op212 = new javax.swing.JTextArea();
        jScrollPane79 = new javax.swing.JScrollPane();
        op312 = new javax.swing.JTextArea();
        jScrollPane80 = new javax.swing.JScrollPane();
        op412 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1365, 730));

        jPanel42.setBackground(new java.awt.Color(255, 255, 255));
        jPanel42.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        min.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        min.setText("  00:");

        sec.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        sec.setText("  00");

        h.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        h.setText("  2:");

        javax.swing.GroupLayout jPanel42Layout = new javax.swing.GroupLayout(jPanel42);
        jPanel42.setLayout(jPanel42Layout);
        jPanel42Layout.setHorizontalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(min, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sec, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel42Layout.setVerticalGroup(
            jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel42Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel42Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(min, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(h, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel117.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel117.setText("ADVANCE JAVA PROGRAMMING");

        jLabel118.setFont(new java.awt.Font("Cooper Black", 0, 14)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(204, 0, 0));
        jLabel118.setText("NOTE");
        jLabel118.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel118MouseEntered(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 204, 204));
        jButton2.setText("SUBMIT");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1355, 560));

        jButton3.setText("next");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        q.setEditable(false);
        q.setColumns(20);
        q.setRows(5);
        q.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(q);

        buttonGroup1.add(jRadioButton1);

        buttonGroup1.add(jRadioButton2);

        buttonGroup1.add(jRadioButton3);

        buttonGroup1.add(jRadioButton4);

        qn.setEditable(false);
        qn.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        qn1.setEditable(false);
        qn1.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        qn2.setEditable(false);
        qn2.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        op1.setEditable(false);
        op1.setColumns(20);
        op1.setRows(5);
        op1.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(op1);

        op2.setEditable(false);
        op2.setColumns(20);
        op2.setRows(5);
        op2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane3.setViewportView(op2);

        op3.setEditable(false);
        op3.setColumns(20);
        op3.setRows(5);
        op3.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane4.setViewportView(op3);

        op4.setEditable(false);
        op4.setColumns(20);
        op4.setRows(5);
        op4.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane5.setViewportView(op4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(qn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(qn1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(qn2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(147, 147, 147)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qn1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qn2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton3)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton4))
                        .addGap(12, 12, 12)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel5.setPreferredSize(new java.awt.Dimension(1355, 560));

        jButton6.setText("next");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        q3.setEditable(false);
        q3.setColumns(20);
        q3.setRows(5);
        q3.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane16.setViewportView(q3);

        buttonGroup2.add(jRadioButton13);

        buttonGroup2.add(jRadioButton14);

        buttonGroup2.add(jRadioButton15);

        buttonGroup2.add(jRadioButton16);

        qnp2.setEditable(false);
        qnp2.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        qset2.setEditable(false);
        qset2.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        marks2.setEditable(false);
        marks2.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        op12.setEditable(false);
        op12.setColumns(20);
        op12.setRows(5);
        op12.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane17.setViewportView(op12);

        op2_2.setEditable(false);
        op2_2.setColumns(20);
        op2_2.setRows(5);
        op2_2.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane18.setViewportView(op2_2);

        op32.setEditable(false);
        op32.setColumns(20);
        op32.setRows(5);
        op32.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane19.setViewportView(op32);

        op16.setEditable(false);
        op16.setColumns(20);
        op16.setRows(5);
        op16.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane20.setViewportView(op16);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(qnp2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(qset2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(marks2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jRadioButton13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jRadioButton14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(147, 147, 147)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jRadioButton16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jRadioButton15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(354, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qset2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qnp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton13)
                    .addComponent(jRadioButton15)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton14)
                            .addComponent(jRadioButton16))
                        .addGap(12, 12, 12)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setPreferredSize(new java.awt.Dimension(1355, 560));

        jButton7.setText("next");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        q4.setEditable(false);
        q4.setColumns(20);
        q4.setRows(5);
        q4.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane21.setViewportView(q4);

        buttonGroup3.add(jRadioButton17);

        buttonGroup3.add(jRadioButton18);

        buttonGroup3.add(jRadioButton19);

        buttonGroup3.add(jRadioButton20);

        qnp3.setEditable(false);
        qnp3.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        qset3.setEditable(false);
        qset3.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        marks3.setEditable(false);
        marks3.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        op13.setEditable(false);
        op13.setColumns(20);
        op13.setRows(5);
        op13.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane22.setViewportView(op13);

        op2_3.setEditable(false);
        op2_3.setColumns(20);
        op2_3.setRows(5);
        op2_3.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane23.setViewportView(op2_3);

        op33.setEditable(false);
        op33.setColumns(20);
        op33.setRows(5);
        op33.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane24.setViewportView(op33);

        op43.setEditable(false);
        op43.setColumns(20);
        op43.setRows(5);
        op43.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane25.setViewportView(op43);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(qnp3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(qset3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(marks3, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jRadioButton17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jRadioButton18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(147, 147, 147)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jRadioButton20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jRadioButton19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(364, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qset3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane21, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qnp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton17)
                    .addComponent(jRadioButton19)
                    .addComponent(jScrollPane22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton18)
                            .addComponent(jRadioButton20))
                        .addGap(12, 12, 12)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(1355, 560));

        jButton5.setText("next");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        q2.setEditable(false);
        q2.setColumns(20);
        q2.setRows(5);
        jScrollPane11.setViewportView(q2);

        buttonGroup4.add(jRadioButton9);

        buttonGroup4.add(jRadioButton10);

        buttonGroup4.add(jRadioButton11);

        buttonGroup4.add(jRadioButton12);

        qn4.setEditable(false);
        qn4.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        qs4.setEditable(false);
        qs4.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        marks4.setEditable(false);
        marks4.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        op14.setEditable(false);
        op14.setColumns(20);
        op14.setRows(5);
        op14.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane12.setViewportView(op14);

        op_24.setEditable(false);
        op_24.setColumns(20);
        op_24.setRows(5);
        op_24.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane13.setViewportView(op_24);

        op34.setEditable(false);
        op34.setColumns(20);
        op34.setRows(5);
        op34.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane14.setViewportView(op34);

        op44.setEditable(false);
        op44.setColumns(20);
        op44.setRows(5);
        op44.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane15.setViewportView(op44);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(qn4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(qs4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(marks4, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jRadioButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jRadioButton10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(147, 147, 147)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jRadioButton12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jRadioButton11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(364, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qs4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane11, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton9)
                    .addComponent(jRadioButton11)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton10)
                            .addComponent(jRadioButton12))
                        .addGap(12, 12, 12)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1355, 560));

        jButton4.setText("next");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        q1.setEditable(false);
        q1.setColumns(20);
        q1.setRows(5);
        jScrollPane6.setViewportView(q1);

        buttonGroup5.add(jRadioButton5);

        buttonGroup5.add(jRadioButton6);

        buttonGroup5.add(jRadioButton7);

        buttonGroup5.add(jRadioButton8);

        qn3.setEditable(false);
        qn3.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        qs5.setEditable(false);
        qs5.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        marks5.setEditable(false);
        marks5.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        op_15.setEditable(false);
        op_15.setColumns(20);
        op_15.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        op_15.setRows(5);
        op_15.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane7.setViewportView(op_15);

        op25.setEditable(false);
        op25.setColumns(20);
        op25.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        op25.setRows(5);
        op25.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane8.setViewportView(op25);

        op_35.setEditable(false);
        op_35.setColumns(20);
        op_35.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        op_35.setRows(5);
        op_35.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane9.setViewportView(op_35);

        op45.setEditable(false);
        op45.setColumns(20);
        op45.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        op45.setRows(5);
        op45.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane10.setViewportView(op45);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(qn3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(qs5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(marks5, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioButton5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(147, 147, 147)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(364, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qs5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton5)
                    .addComponent(jRadioButton7)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton8))
                        .addGap(12, 12, 12)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setPreferredSize(new java.awt.Dimension(1355, 530));

        jButton10.setText("next");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        q7.setEditable(false);
        q7.setColumns(20);
        q7.setRows(5);
        jScrollPane36.setViewportView(q7);

        buttonGroup6.add(jRadioButton29);

        buttonGroup6.add(jRadioButton30);

        buttonGroup6.add(jRadioButton31);

        buttonGroup6.add(jRadioButton32);

        qn7.setEditable(false);
        qn7.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        qs6.setEditable(false);
        qs6.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        marks6.setEditable(false);
        marks6.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        op_16.setEditable(false);
        op_16.setColumns(20);
        op_16.setRows(5);
        op_16.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane37.setViewportView(op_16);

        op26.setEditable(false);
        op26.setColumns(20);
        op26.setRows(5);
        op26.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane38.setViewportView(op26);

        op36.setEditable(false);
        op36.setColumns(20);
        op36.setRows(5);
        op36.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane39.setViewportView(op36);

        op46.setEditable(false);
        op46.setColumns(20);
        op46.setRows(5);
        op46.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane40.setViewportView(op46);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(qn7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(qs6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(marks6, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jRadioButton29)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jRadioButton30)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(147, 147, 147)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jRadioButton32)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jRadioButton31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(364, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qs6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks6, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane36, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton29)
                    .addComponent(jRadioButton31)
                    .addComponent(jScrollPane37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton30)
                            .addComponent(jRadioButton32))
                        .addGap(12, 12, 12)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(1355, 530));

        jButton11.setText("next");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        q8.setEditable(false);
        q8.setColumns(20);
        q8.setRows(5);
        jScrollPane41.setViewportView(q8);

        buttonGroup7.add(jRadioButton33);

        buttonGroup7.add(jRadioButton34);

        buttonGroup7.add(jRadioButton35);

        buttonGroup7.add(jRadioButton36);

        qn10.setEditable(false);
        qn10.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        qn11.setEditable(false);
        qn11.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        qn12.setEditable(false);
        qn12.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        op17.setEditable(false);
        op17.setColumns(20);
        op17.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        op17.setRows(5);
        op17.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane42.setViewportView(op17);

        op27.setEditable(false);
        op27.setColumns(20);
        op27.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        op27.setRows(5);
        op27.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane43.setViewportView(op27);

        op37.setEditable(false);
        op37.setColumns(20);
        op37.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        op37.setRows(5);
        op37.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane44.setViewportView(op37);

        op20.setEditable(false);
        op20.setColumns(20);
        op20.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        op20.setRows(5);
        op20.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane45.setViewportView(op20);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(qn10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(qn11, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(qn12, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jRadioButton33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jRadioButton34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(147, 147, 147)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jRadioButton36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel10Layout.createSequentialGroup()
                                .addComponent(jRadioButton35)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(364, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qn11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qn12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane41, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qn10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton33)
                    .addComponent(jRadioButton35)
                    .addComponent(jScrollPane42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton34)
                            .addComponent(jRadioButton36))
                        .addGap(12, 12, 12)
                        .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));
        jPanel11.setPreferredSize(new java.awt.Dimension(1355, 530));

        jButton12.setText("next");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        q9.setEditable(false);
        q9.setColumns(20);
        q9.setRows(5);
        jScrollPane46.setViewportView(q9);

        buttonGroup8.add(jRadioButton37);

        buttonGroup8.add(jRadioButton38);

        buttonGroup8.add(jRadioButton39);

        buttonGroup8.add(jRadioButton40);

        qn13.setEditable(false);
        qn13.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        qs8.setEditable(false);
        qs8.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        marks8.setEditable(false);
        marks8.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        op18.setEditable(false);
        op18.setColumns(20);
        op18.setRows(5);
        op18.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane47.setViewportView(op18);

        op_28.setEditable(false);
        op_28.setColumns(20);
        op_28.setRows(5);
        op_28.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane48.setViewportView(op_28);

        op38.setEditable(false);
        op38.setColumns(20);
        op38.setRows(5);
        op38.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane49.setViewportView(op38);

        op_48.setEditable(false);
        op_48.setColumns(20);
        op_48.setRows(5);
        op_48.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane50.setViewportView(op_48);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(qn13, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(qs8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(marks8, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jRadioButton37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jRadioButton38)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane48, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(147, 147, 147)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jRadioButton40)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane50, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jRadioButton39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(364, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qs8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane46, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qn13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton37)
                    .addComponent(jRadioButton39)
                    .addComponent(jScrollPane47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton38)
                            .addComponent(jRadioButton40))
                        .addGap(12, 12, 12)
                        .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setPreferredSize(new java.awt.Dimension(1355, 530));

        jButton15.setText("next");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        q12.setEditable(false);
        q12.setColumns(20);
        q12.setRows(5);
        jScrollPane61.setViewportView(q12);

        buttonGroup9.add(jRadioButton49);

        buttonGroup9.add(jRadioButton50);

        buttonGroup9.add(jRadioButton51);

        buttonGroup9.add(jRadioButton52);

        qn16.setEditable(false);
        qn16.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        qs11.setEditable(false);
        qs11.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        marks9.setEditable(false);
        marks9.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        op22.setEditable(false);
        op22.setColumns(20);
        op22.setRows(5);
        op22.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane62.setViewportView(op22);

        op41.setEditable(false);
        op41.setColumns(20);
        op41.setRows(5);
        op41.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane63.setViewportView(op41);

        op42.setEditable(false);
        op42.setColumns(20);
        op42.setRows(5);
        op42.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane64.setViewportView(op42);

        op47.setEditable(false);
        op47.setColumns(20);
        op47.setRows(5);
        op47.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane65.setViewportView(op47);

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(qn16, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane61, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(qs11, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(marks9, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jRadioButton49)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane62, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jRadioButton50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane63, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(147, 147, 147)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jRadioButton52)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane65, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jRadioButton51)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane64, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(354, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qs11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks9, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane61, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qn16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton49)
                    .addComponent(jRadioButton51)
                    .addComponent(jScrollPane62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton50)
                            .addComponent(jRadioButton52))
                        .addGap(12, 12, 12)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.setPreferredSize(new java.awt.Dimension(1355, 530));

        jButton16.setText("next");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        q13.setEditable(false);
        q13.setColumns(20);
        q13.setRows(5);
        jScrollPane66.setViewportView(q13);

        buttonGroup10.add(jRadioButton53);

        buttonGroup10.add(jRadioButton54);

        buttonGroup10.add(jRadioButton55);

        buttonGroup10.add(jRadioButton56);

        qn17.setEditable(false);
        qn17.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        qs12.setEditable(false);
        qs12.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        marks10.setEditable(false);
        marks10.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        op110.setEditable(false);
        op110.setColumns(20);
        op110.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        op110.setRows(5);
        op110.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane67.setViewportView(op110);

        op210.setEditable(false);
        op210.setColumns(20);
        op210.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        op210.setRows(5);
        op210.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane68.setViewportView(op210);

        op310.setEditable(false);
        op310.setColumns(20);
        op310.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        op310.setRows(5);
        op310.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane69.setViewportView(op310);

        op410.setEditable(false);
        op410.setColumns(20);
        op410.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        op410.setRows(5);
        op410.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane70.setViewportView(op410);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(qn17, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane66, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(qs12, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(marks10, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jRadioButton53)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane67, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jRadioButton54)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane68, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(147, 147, 147)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jRadioButton56)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane70, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addComponent(jRadioButton55)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane69, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(374, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qs12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane66, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qn17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton53)
                    .addComponent(jRadioButton55)
                    .addComponent(jScrollPane67, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane69, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton54)
                            .addComponent(jRadioButton56))
                        .addGap(12, 12, 12)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane68, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));
        jPanel16.setPreferredSize(new java.awt.Dimension(1355, 530));

        jButton17.setText("next");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        q14.setEditable(false);
        q14.setColumns(20);
        q14.setRows(5);
        jScrollPane71.setViewportView(q14);

        buttonGroup11.add(jRadioButton57);

        buttonGroup11.add(jRadioButton58);

        buttonGroup11.add(jRadioButton59);

        buttonGroup11.add(jRadioButton60);

        qn18.setEditable(false);
        qn18.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        qs13.setEditable(false);
        qs13.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        marks11.setEditable(false);
        marks11.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        op111.setEditable(false);
        op111.setColumns(20);
        op111.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        op111.setRows(5);
        op111.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane72.setViewportView(op111);

        op211.setEditable(false);
        op211.setColumns(20);
        op211.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        op211.setRows(5);
        op211.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane73.setViewportView(op211);

        op311.setEditable(false);
        op311.setColumns(20);
        op311.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        op311.setRows(5);
        op311.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane74.setViewportView(op311);

        op411.setEditable(false);
        op411.setColumns(20);
        op411.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        op411.setRows(5);
        op411.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane75.setViewportView(op411);

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(qn18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane71, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(qs13, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(marks11, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jRadioButton57)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane72, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jRadioButton58)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane73, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(147, 147, 147)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jRadioButton60)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane75, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jRadioButton59)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane74, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(374, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qs13, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane71, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qn18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton57)
                    .addComponent(jRadioButton59)
                    .addComponent(jScrollPane72, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton58)
                            .addComponent(jRadioButton60))
                        .addGap(12, 12, 12)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane73, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));
        jPanel17.setPreferredSize(new java.awt.Dimension(1355, 530));

        jButton18.setText("next");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        q15.setEditable(false);
        q15.setColumns(20);
        q15.setRows(5);
        jScrollPane76.setViewportView(q15);

        buttonGroup12.add(jRadioButton61);

        buttonGroup12.add(jRadioButton62);

        buttonGroup12.add(jRadioButton63);

        buttonGroup12.add(jRadioButton64);

        qn19.setEditable(false);
        qn19.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        qs14.setEditable(false);
        qs14.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        marks12.setEditable(false);
        marks12.setDisabledTextColor(new java.awt.Color(255, 255, 255));

        op112.setEditable(false);
        op112.setColumns(20);
        op112.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        op112.setRows(5);
        op112.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane77.setViewportView(op112);

        jScrollPane78.setBackground(java.awt.Color.white);

        op212.setEditable(false);
        op212.setColumns(20);
        op212.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        op212.setRows(5);
        op212.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane78.setViewportView(op212);

        op312.setEditable(false);
        op312.setColumns(20);
        op312.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        op312.setRows(5);
        op312.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane79.setViewportView(op312);

        op412.setEditable(false);
        op412.setColumns(20);
        op412.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        op412.setRows(5);
        op412.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane80.setViewportView(op412);

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(qn19, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane76, javax.swing.GroupLayout.PREFERRED_SIZE, 842, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(qs14, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(marks12, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jRadioButton61)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane77, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jRadioButton62)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane78, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(147, 147, 147)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jRadioButton64)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane80, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jRadioButton63)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane79, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(374, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qs14, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(marks12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane76, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(qn19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton61)
                    .addComponent(jRadioButton63)
                    .addComponent(jScrollPane77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane79, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton62)
                            .addComponent(jRadioButton64))
                        .addGap(12, 12, 12)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel118)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel117)
                .addGap(329, 329, 329)
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel118)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(99, 99, 99)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(46, Short.MAX_VALUE)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(109, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                    .addGap(41, 41, 41)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(111, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                    .addGap(39, 39, 39)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(111, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 556, Short.MAX_VALUE)
                    .addGap(39, 39, 39)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(121, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                    .addGap(50, 50, 50)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(131, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, 539, Short.MAX_VALUE)
                    .addGap(40, 40, 40)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(141, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                    .addGap(41, 41, 41)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(126, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(43, 43, 43)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(136, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(52, 52, 52)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(146, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(42, 42, 42)))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                    .addContainerGap(136, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(52, 52, 52)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1375, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 705, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
try{
             
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mock", "root", "tiger");
            Statement st= con.createStatement();
            String Query="select * from quest where qn=9" ;
            
            PreparedStatement ps=con.prepareStatement(Query);
            
            ResultSet rs=ps.executeQuery();
            
                if(rs.next()==true)
                    
                 {
                     int g2=Integer.parseInt(buttonGroup8.getSelection().getActionCommand());
                    int a1=rs.getInt(6);
                    int m1=rs.getInt(8);
                    if(g2==a1)
                    {
                        n8=m1;
                    }
                }
                }
            catch(ClassNotFoundException | SQLException e)
            {
                
            }
        jPanel14.setVisible(true);
        question1(1,9);
        jPanel1.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanel4.setVisible(false);
        jPanel2.setVisible(false);
        jPanel9.setVisible(false);
        jPanel10.setVisible(false);
        jPanel11.setVisible(false);
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
           try{
             
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mock", "root", "tiger");
            Statement st= con.createStatement();
            String Query="select * from quest where qn=7" ;
            
            PreparedStatement ps=con.prepareStatement(Query);
            
            ResultSet rs=ps.executeQuery();
            
                if(rs.next()==true)
                    
                 {
                     int g2=Integer.parseInt(buttonGroup7.getSelection().getActionCommand());
                    int a1=rs.getInt(6);
                    int m1=rs.getInt(8);
                    if(g2==a1)
                    {
                        n7=m1;
                    }
                }
                }
            catch(ClassNotFoundException | SQLException e)
            {
                
            }
        jPanel11.setVisible(true);
        question1(1,8);
        jPanel1.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanel4.setVisible(false);
        jPanel2.setVisible(false);
        jPanel9.setVisible(false);
        jPanel10.setVisible(false);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        try{
             
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mock", "root", "tiger");
            Statement st= con.createStatement();
            String Query="select * from quest where qn=6" ;
            
            PreparedStatement ps=con.prepareStatement(Query);
            
            ResultSet rs=ps.executeQuery();
            
                if(rs.next()==true)
                    
                 {
                     int g6=Integer.parseInt(buttonGroup6.getSelection().getActionCommand());
                    int a1=rs.getInt(6);
                    int m1=rs.getInt(8);
                    if(g6==a1)
                    {
                        n6=m1;
                    }
                }
                }
            catch(ClassNotFoundException | SQLException e)
            {
                
            }
        jPanel10.setVisible(true);
        question1(1,7);
        jPanel1.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanel4.setVisible(false);
        jPanel2.setVisible(false);
        jPanel9.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try{
             
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mock", "root", "tiger");
            Statement st= con.createStatement();
            String Query="select * from quest where qn=5" ;
            
            PreparedStatement ps=con.prepareStatement(Query);
            
            ResultSet rs=ps.executeQuery();
            
                if(rs.next()==true)
                    
                 {
                     int g5=Integer.parseInt(buttonGroup5.getSelection().getActionCommand());
                    int a1=rs.getInt(6);
                    int m1=rs.getInt(8);
                    if(g5==a1)
                    {
                        n5=m1;
                    }
                }
                }
            catch(ClassNotFoundException | SQLException e)
            {
                
            }
        jPanel9.setVisible(true);
        question1(1,6);
        jPanel1.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanel4.setVisible(false);
        jPanel2.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try{
             
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mock", "root", "tiger");
            Statement st= con.createStatement();
            String Query="select * from quest where qn=4" ;
            
            PreparedStatement ps=con.prepareStatement(Query);
            
            ResultSet rs=ps.executeQuery();
            
                if(rs.next()==true)
                    
                 {
                     int g4=Integer.parseInt(buttonGroup4.getSelection().getActionCommand());
                    int a1=rs.getInt(6);
                    int m1=rs.getInt(8);
                    if(g4==a1)
                    {
                        n4=m1;
                    }
                }
                }
            catch(ClassNotFoundException | SQLException e)
            {
                
            }
           
        jPanel2.setVisible(true);
        question1(1,5);
        jPanel1.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanel4.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try{
             
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mock", "root", "tiger");
            Statement st= con.createStatement();
            String Query="select * from quest where qn=3" ;
            
            PreparedStatement ps=con.prepareStatement(Query);
            
            ResultSet rs=ps.executeQuery();
            
                if(rs.next()==true)
                    
                 {
                     int g3=Integer.parseInt(buttonGroup3.getSelection().getActionCommand());
                    int a1=rs.getInt(6);
                    int m1=rs.getInt(8);
                    if(g3==a1)
                    {
                        n3=m1;
                        
                    }
                }
                }
            catch(ClassNotFoundException | SQLException e)
            {
                
            }
        jPanel4.setVisible(true);
        question1(1,4);
        jPanel1.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        try{
             
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mock", "root", "tiger");
            Statement st= con.createStatement();
            String Query="select * from quest where qn=2" ;
            
            PreparedStatement ps=con.prepareStatement(Query);
            
            ResultSet rs=ps.executeQuery();
            
                if(rs.next()==true)
                    
                 {
                     int g2=Integer.parseInt(buttonGroup2.getSelection().getActionCommand());
                    int a1=rs.getInt(6);
                    int m1=rs.getInt(8);
                    if(g2==a1)
                    {
                        n2=m1;
                    }
                }
                }
            catch(ClassNotFoundException | SQLException e)
            {
                
            }
        jPanel6.setVisible(true);
        question1(1,3);
        jPanel1.setVisible(false);
        jPanel5.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mock", "root", "tiger");
            Statement st= con.createStatement();
            String Query="select * from quest where qn=1" ;
            
            PreparedStatement ps=con.prepareStatement(Query);
            
            ResultSet rs=ps.executeQuery();
            
                if(rs.next()==true)
                    
                 {
                    int g1=Integer.parseInt(buttonGroup1.getSelection().getActionCommand());
                    int a1=rs.getInt(6);
                    int m1=rs.getInt(8);
                    if(g1==a1)
                    {
                        n1=m1;
                    }
                }
                }
            catch(ClassNotFoundException | SQLException e)
            {
                
            }
        jPanel5.setVisible(true);
        question1(1,2);
        jPanel1.setVisible(false);

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int sum=n1+n2+n3+n4+n5+n6+n7+n8+n9+n10+n11+n12;      
       String n=Studentlogin.roll.getText();
     try{
             
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mock", "root", "tiger");
            Statement st= con.createStatement();
            String Query="update demo set ajpm=? where rno='"+sum+"'" ;
            
            PreparedStatement ps=con.prepareStatement(Query);
            
            ps.setInt(1,sum);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "SUBMITED");
            }    
            catch(ClassNotFoundException | SQLException e)
            {
                
            }
            JOptionPane.showMessageDialog(null, "EXAM OVER");
            dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel118MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel118MouseEntered
        JOptionPane.showMessageDialog(null, "THIS INCLUDES TEST OF 100 MARKS AND HAVE TO COMPLETE IT UNDER 2 HOURS");
    }//GEN-LAST:event_jLabel118MouseEntered

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        try{
             
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mock", "root", "tiger");
            Statement st= con.createStatement();
            String Query="select * from quest where qn=9" ;
            
            PreparedStatement ps=con.prepareStatement(Query);
            
            ResultSet rs=ps.executeQuery();
            
                if(rs.next()==true)
                    
                 {
                     int g2=Integer.parseInt(buttonGroup9.getSelection().getActionCommand());
                    int a1=rs.getInt(6);
                    int m1=rs.getInt(8);
                    if(g2==a1)
                    {
                        n9=m1;
                    }
                }
                }
            catch(ClassNotFoundException | SQLException e)
            {
                
            }
        jPanel15.setVisible(true);
        question1(1,10);
        jPanel1.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanel4.setVisible(false);
        jPanel2.setVisible(false);
        jPanel9.setVisible(false);
        jPanel10.setVisible(false);
        jPanel11.setVisible(false);
        jPanel14.setVisible(false);
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        try{
             
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mock", "root", "tiger");
            Statement st= con.createStatement();
            String Query="select * from quest where qn=10" ;
            
            PreparedStatement ps=con.prepareStatement(Query);
            
            ResultSet rs=ps.executeQuery();
            
                if(rs.next()==true)
                    
                 {
                     int g2=Integer.parseInt(buttonGroup10.getSelection().getActionCommand());
                    int a1=rs.getInt(6);
                    int m1=rs.getInt(8);
                    if(g2==a1)
                    {
                        n10=m1;
                    }
                }
                }
            catch(ClassNotFoundException | SQLException e)
            {
                
            }
        jPanel16.setVisible(true);
        question1(1,11);
        jPanel1.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanel4.setVisible(false);
        jPanel2.setVisible(false);
        jPanel9.setVisible(false);
        jPanel10.setVisible(false);
        jPanel11.setVisible(false);
        jPanel14.setVisible(false);
        jPanel15.setVisible(false);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        try{
             
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mock", "root", "tiger");
            Statement st= con.createStatement();
            String Query="select * from quest where qn=11" ;
            
            PreparedStatement ps=con.prepareStatement(Query);
            
            ResultSet rs=ps.executeQuery();
            
                if(rs.next()==true)
                    
                 {
                     int g2=Integer.parseInt(buttonGroup11.getSelection().getActionCommand());
                    int a1=rs.getInt(6);
                    int m1=rs.getInt(8);
                    if(g2==a1)
                    {
                        n11=m1;
                    }
                }
                }
            catch(ClassNotFoundException | SQLException e)
            {
                
            }
        jPanel17.setVisible(true);
        question1(1,12);
        jPanel1.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanel4.setVisible(false);
        jPanel2.setVisible(false);
        jPanel9.setVisible(false);
        jPanel10.setVisible(false);
        jPanel11.setVisible(false);
        jPanel14.setVisible(false);
        jPanel15.setVisible(false);
        jPanel16.setVisible(false);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        try{
             
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost/mock", "root", "tiger");
            Statement st= con.createStatement();
            String Query="select * from quest where qn=12" ;
            
            PreparedStatement ps=con.prepareStatement(Query);
            
            ResultSet rs=ps.executeQuery();
            
                if(rs.next()==true)
                    
                 {
                     int g2=Integer.parseInt(buttonGroup12.getSelection().getActionCommand());
                    int a1=rs.getInt(6);
                    int m1=rs.getInt(8);
                    if(g2==a1)
                    {
                        n12=m1;
                    }
                }
                }
            catch(ClassNotFoundException | SQLException e)
            {
                
            }
        question1(1,13);
        jPanel1.setVisible(false);
        jPanel5.setVisible(false);
        jPanel6.setVisible(false);
        jPanel4.setVisible(false);
        jPanel2.setVisible(false);
        jPanel9.setVisible(false);
        jPanel10.setVisible(false);
        jPanel11.setVisible(false);
        jPanel14.setVisible(false);
        jPanel15.setVisible(false);
        jPanel16.setVisible(false);
        jPanel17.setVisible(false);
    }//GEN-LAST:event_jButton18ActionPerformed

   
   
        
    
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
            java.util.logging.Logger.getLogger(question1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(question1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(question1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(question1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new question1().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup12;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JLabel h;
    public static javax.swing.JButton jButton10;
    public static javax.swing.JButton jButton11;
    public static javax.swing.JButton jButton12;
    public static javax.swing.JButton jButton15;
    public static javax.swing.JButton jButton16;
    public static javax.swing.JButton jButton17;
    public static javax.swing.JButton jButton18;
    public javax.swing.JButton jButton2;
    public static javax.swing.JButton jButton3;
    public static javax.swing.JButton jButton4;
    public static javax.swing.JButton jButton5;
    public static javax.swing.JButton jButton6;
    public static javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton13;
    private javax.swing.JRadioButton jRadioButton14;
    private javax.swing.JRadioButton jRadioButton15;
    private javax.swing.JRadioButton jRadioButton16;
    private javax.swing.JRadioButton jRadioButton17;
    private javax.swing.JRadioButton jRadioButton18;
    private javax.swing.JRadioButton jRadioButton19;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton20;
    private javax.swing.JRadioButton jRadioButton29;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton30;
    private javax.swing.JRadioButton jRadioButton31;
    private javax.swing.JRadioButton jRadioButton32;
    private javax.swing.JRadioButton jRadioButton33;
    private javax.swing.JRadioButton jRadioButton34;
    private javax.swing.JRadioButton jRadioButton35;
    private javax.swing.JRadioButton jRadioButton36;
    private javax.swing.JRadioButton jRadioButton37;
    private javax.swing.JRadioButton jRadioButton38;
    private javax.swing.JRadioButton jRadioButton39;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton40;
    private javax.swing.JRadioButton jRadioButton49;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton50;
    private javax.swing.JRadioButton jRadioButton51;
    private javax.swing.JRadioButton jRadioButton52;
    private javax.swing.JRadioButton jRadioButton53;
    private javax.swing.JRadioButton jRadioButton54;
    private javax.swing.JRadioButton jRadioButton55;
    private javax.swing.JRadioButton jRadioButton56;
    private javax.swing.JRadioButton jRadioButton57;
    private javax.swing.JRadioButton jRadioButton58;
    private javax.swing.JRadioButton jRadioButton59;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton60;
    private javax.swing.JRadioButton jRadioButton61;
    private javax.swing.JRadioButton jRadioButton62;
    private javax.swing.JRadioButton jRadioButton63;
    private javax.swing.JRadioButton jRadioButton64;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane20;
    private javax.swing.JScrollPane jScrollPane21;
    private javax.swing.JScrollPane jScrollPane22;
    private javax.swing.JScrollPane jScrollPane23;
    private javax.swing.JScrollPane jScrollPane24;
    private javax.swing.JScrollPane jScrollPane25;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane36;
    private javax.swing.JScrollPane jScrollPane37;
    private javax.swing.JScrollPane jScrollPane38;
    private javax.swing.JScrollPane jScrollPane39;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane40;
    private javax.swing.JScrollPane jScrollPane41;
    private javax.swing.JScrollPane jScrollPane42;
    private javax.swing.JScrollPane jScrollPane43;
    private javax.swing.JScrollPane jScrollPane44;
    private javax.swing.JScrollPane jScrollPane45;
    private javax.swing.JScrollPane jScrollPane46;
    private javax.swing.JScrollPane jScrollPane47;
    private javax.swing.JScrollPane jScrollPane48;
    private javax.swing.JScrollPane jScrollPane49;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane50;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane61;
    private javax.swing.JScrollPane jScrollPane62;
    private javax.swing.JScrollPane jScrollPane63;
    private javax.swing.JScrollPane jScrollPane64;
    private javax.swing.JScrollPane jScrollPane65;
    private javax.swing.JScrollPane jScrollPane66;
    private javax.swing.JScrollPane jScrollPane67;
    private javax.swing.JScrollPane jScrollPane68;
    private javax.swing.JScrollPane jScrollPane69;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane70;
    private javax.swing.JScrollPane jScrollPane71;
    private javax.swing.JScrollPane jScrollPane72;
    private javax.swing.JScrollPane jScrollPane73;
    private javax.swing.JScrollPane jScrollPane74;
    private javax.swing.JScrollPane jScrollPane75;
    private javax.swing.JScrollPane jScrollPane76;
    private javax.swing.JScrollPane jScrollPane77;
    private javax.swing.JScrollPane jScrollPane78;
    private javax.swing.JScrollPane jScrollPane79;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane80;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextField marks10;
    private javax.swing.JTextField marks11;
    private javax.swing.JTextField marks12;
    private javax.swing.JTextField marks2;
    private javax.swing.JTextField marks3;
    private javax.swing.JTextField marks4;
    private javax.swing.JTextField marks5;
    private javax.swing.JTextField marks6;
    private javax.swing.JTextField marks8;
    private javax.swing.JTextField marks9;
    private javax.swing.JLabel min;
    private javax.swing.JTextArea op1;
    private javax.swing.JTextArea op110;
    private javax.swing.JTextArea op111;
    private javax.swing.JTextArea op112;
    private javax.swing.JTextArea op12;
    private javax.swing.JTextArea op13;
    private javax.swing.JTextArea op14;
    private javax.swing.JTextArea op16;
    private javax.swing.JTextArea op17;
    private javax.swing.JTextArea op18;
    private javax.swing.JTextArea op2;
    private javax.swing.JTextArea op20;
    private javax.swing.JTextArea op210;
    private javax.swing.JTextArea op211;
    private javax.swing.JTextArea op212;
    private javax.swing.JTextArea op22;
    private javax.swing.JTextArea op25;
    private javax.swing.JTextArea op26;
    private javax.swing.JTextArea op27;
    private javax.swing.JTextArea op2_2;
    private javax.swing.JTextArea op2_3;
    private javax.swing.JTextArea op3;
    private javax.swing.JTextArea op310;
    private javax.swing.JTextArea op311;
    private javax.swing.JTextArea op312;
    private javax.swing.JTextArea op32;
    private javax.swing.JTextArea op33;
    private javax.swing.JTextArea op34;
    private javax.swing.JTextArea op36;
    private javax.swing.JTextArea op37;
    private javax.swing.JTextArea op38;
    private javax.swing.JTextArea op4;
    private javax.swing.JTextArea op41;
    private javax.swing.JTextArea op410;
    private javax.swing.JTextArea op411;
    private javax.swing.JTextArea op412;
    private javax.swing.JTextArea op42;
    private javax.swing.JTextArea op43;
    private javax.swing.JTextArea op44;
    private javax.swing.JTextArea op45;
    private javax.swing.JTextArea op46;
    private javax.swing.JTextArea op47;
    private javax.swing.JTextArea op_15;
    private javax.swing.JTextArea op_16;
    private javax.swing.JTextArea op_24;
    private javax.swing.JTextArea op_28;
    private javax.swing.JTextArea op_35;
    private javax.swing.JTextArea op_48;
    private javax.swing.JTextArea q;
    private javax.swing.JTextArea q1;
    private javax.swing.JTextArea q12;
    private javax.swing.JTextArea q13;
    private javax.swing.JTextArea q14;
    private javax.swing.JTextArea q15;
    private javax.swing.JTextArea q2;
    private javax.swing.JTextArea q3;
    private javax.swing.JTextArea q4;
    private javax.swing.JTextArea q7;
    private javax.swing.JTextArea q8;
    private javax.swing.JTextArea q9;
    private javax.swing.JTextField qn;
    private javax.swing.JTextField qn1;
    private javax.swing.JTextField qn10;
    private javax.swing.JTextField qn11;
    private javax.swing.JTextField qn12;
    private javax.swing.JTextField qn13;
    private javax.swing.JTextField qn16;
    private javax.swing.JTextField qn17;
    private javax.swing.JTextField qn18;
    private javax.swing.JTextField qn19;
    private javax.swing.JTextField qn2;
    private javax.swing.JTextField qn3;
    private javax.swing.JTextField qn4;
    private javax.swing.JTextField qn7;
    private javax.swing.JTextField qnp2;
    private javax.swing.JTextField qnp3;
    private javax.swing.JTextField qs11;
    private javax.swing.JTextField qs12;
    private javax.swing.JTextField qs13;
    private javax.swing.JTextField qs14;
    private javax.swing.JTextField qs4;
    private javax.swing.JTextField qs5;
    private javax.swing.JTextField qs6;
    private javax.swing.JTextField qs8;
    private javax.swing.JTextField qset2;
    private javax.swing.JTextField qset3;
    private javax.swing.JLabel sec;
    // End of variables declaration//GEN-END:variables
}
