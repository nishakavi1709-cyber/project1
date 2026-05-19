import javax.Swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Handler;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
class Biodata exends Jframe
{
    private JLable 11,12,13;
    private JTexField n;
    private JRadioButton r1,r2;
    private ButtonGroup g;
    private JcheckBox c1,c2,c3;
    private JTextArea a;
    private JButton b;
    Biodata()
    {
        Super("\t\t Enter the Boidata");
        Container c-=getContentpane();
        c.setLayout(new Flowlayout());
        11=new JLable("\t\t Name");
        c.add(11);
        System.err.println("");
        System.err.println("");
        System.err.println("");
        n=new JTextField("enter your Name",20);
        n.SetToolTipText("\t\t please enter youe name");
        c.add(n);
        r1=new JRadioButton("\t\t Male ",true);
        c.add(r1);
        r2=new JRadioButton("\t\t female ",false);
        c.add(r2);
        g=new ButtonGroup();
        g.add(r1);
        g.add(r2);
        12=new JLable("\t\t Qualification");
        c.add(12);
        c1=new JCheckBox("\t\t B.SC IT");
        c.add(c1);
        b=new JButton("\t\t show");
        c.add(b);
        c2=new JCheckBox("\t\t M.SC.IT");
        c.add(c2);
        c3=new JCheckBox("\t\t MCA" );
        c.add(c3);
        13=new JLabel("\t\t Address");
        c.add(13);
        a=new JTextArea(10,20);
        c.add(b);
        Handle h=new Handler();
        b.addACtionListener(h);
        this.SetDefaultCloseOperation(Jframe.EXIT_NO_CLOSE);
        Pack();
        SetVisible(true);
        }
        class Handler implements ActionListener
        {
            public void actioPerformed(ActionEvent e)
            {
                String s=""+n.getText()+"\n";
                s+=(r1.isSelected())?r1.getText()+"\n":r2.get Text()+"\n";
                if(c1.isSelected())?=(c1.getText())+" ";
                if(c2.isSelected())?=(c2.getText())+" ";
                if(c3.isSelected())?=(c3.getText())+" ";
                s+="\n"+a.getText()+"";
                JOptionPane.showMessageDialog(null,s);
                }
        }
    public static void main(String[] args) {
        new Biodata();
    }

}