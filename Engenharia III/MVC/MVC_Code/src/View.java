import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class View implements ActionListener, Observer {
	private VeiculoInterface controller;
	private String moto;
	private String carro;
	
	JFrame frame;
	JPanel panelBotoes;
	JPanel panelDados;
	JPanel panelTemp;
	JPanel panelPres;
	JPanel panelHumi;
	JLabel labelTemp;
	JLabel labelPres;
	JLabel labelHumi;
	JLabel tempText;
	JLabel presText;
	JLabel humiText;
	JButton assinar;
	JButton cancelar;
	
	public View(Subject mo, VeiculoInterface co) {
		this.controller = co;
	}
	
	
	public void createView(){
		
		frame = new JFrame("Concessionaria");
		panelBotoes = new JPanel();
		panelDados = new JPanel();
		panelTemp = new JPanel();
		panelPres = new JPanel();
		panelHumi = new JPanel();
		assinar = new JButton("Assinar concessionaria");
		cancelar = new JButton("Cancelar Assinatura");
		labelTemp = new JLabel();
		labelPres = new JLabel();
		labelHumi = new JLabel();
		tempText = new JLabel("Carro");
		presText = new JLabel("Moto");
		
		
		assinar.addActionListener(this);
		cancelar.addActionListener(this);
		
		panelBotoes.add(assinar);
		panelBotoes.add(cancelar);
		panelTemp.add(tempText);
		panelTemp.add(labelTemp);
		panelPres.add(presText);
		panelPres.add(labelPres);
		panelHumi.add(humiText);
		panelHumi.add(labelHumi);
		panelDados.add(panelTemp);
		panelDados.add(panelPres);
		panelDados.add(panelHumi);
		frame.getContentPane().add(BorderLayout.SOUTH, panelBotoes);
		frame.getContentPane().add(BorderLayout.CENTER, panelDados);
		
		labelTemp.setText(carro);
		labelHumi.setText(moto);
		
		
		frame.setSize(300, 150);
		frame.setVisible(true);
		
	}

	public void update(String moto, String carro) {
        moto = moto;
        carro = carro;
        
		display();
	}

	public void display() {
		
		labelTemp.setText(carro);
		labelPres.setText(moto);
		
	}
	
	public void habilitarBotaoAssinar(){
		
		assinar.setEnabled(true);
		
	}
	
	public void desabilitarBotaoAssinar(){
		
		assinar.setEnabled(false);
		
	}
	
	
	public void habilitarBotaoCancelar(){
		
		cancelar.setEnabled(true);
		
	}
	
	public void desabilitarBotaoCancelar(){
		
		cancelar.setEnabled(false);
		
	}
	
	public void actionPerformed(ActionEvent event){
		if (event.getSource() == assinar){
				controller.comprar();
		}
		if (event.getSource() == cancelar){
				controller.vender();
		}
	}
}