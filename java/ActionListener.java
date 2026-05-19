import javax.Swing.*;
import java.awt.*;
import java.awt.event.*;
class Biodata extends Jframe
{
    private JLable l1,l2,l3;
    private JTexField n;
    private JRadioButton r1,r2;
    private ButtonGroup g;
    private JcheckBox c1,c2,c3;
    private JTextArea a;
    private JButton b;
    Biodata()
    {
        super("\t\t Enter  Boidata");
        Container c=getContentpane();
        c.setLayout(new FlowLayout());
        l1=new JLable("\t\t Name");
        c.add(l1);
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
        l2=new JLable("\t\t Qualification");
        c.add(l2);
        c1=new JCheckBox("\t\t B.SC IT");
        c.add(c1);
        b=new JButton("\t\t show");
        c.add(b);
        c2=new JCheckBox("\t\t M.SC.IT");
        c.add(c2);
        c3=new JCheckBox("\t\t MCA");
        c.add(c3);
        l3=new JLabel("\t\t Address");
        c.add(c3);
        a=new JTextArea(10,20);
        c.add(b);
        Handle h=new Handler();
        b.addACtionListener(h);
        this.SetDefaultCloseOperation(Jframe.EXIT_NO_CLOSE);
        Pack();
        setVisible(true);
        }
        class Handler implements ActionListener
        {
            public void actioPerformed(ActionEvent e)
            {
                String s=""+n.getText()+"\n";
                s+=(r1.isSelected())?r1.getText()+"\n":r2.getText()+"\n";
                if(c1.isSelected());s+=(c1.getText())+" ";
                if(c2.isSelected());s+=(c2.getText())+" ";
                if(c3.isSelected());s+=(c3.getText())+" ";
                s+="\n"+a.getText()+"\n";
                jOptionPane.ShowMessageDialog(null,s);
                }
        }
    public static void main(String[] args) {
        new Biodata();
    }

}