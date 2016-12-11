package batnav.view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PainelDoJogo extends JPanel {

    private PainelPrincipal painelPrincipal;


    public PainelDoJogo() {
        setLayout(new BorderLayout());
        
      
        painelPrincipal = new PainelPrincipal();
        add(painelPrincipal, BorderLayout.CENTER);
        
        
        JButton restart = new JButton("Restart");
        restart.addActionListener(e -> painelPrincipal.restart());
        JLabel score = new JLabel("Score: ");
        
        
        JPanel painelBotao = new JPanel();
        painelBotao.add(restart);
        add(painelBotao, BorderLayout.SOUTH);
        JPanel painelScore = new JPanel();
        painelScore.add(score);
        add(painelScore, BorderLayout.NORTH);

 
    }
}
