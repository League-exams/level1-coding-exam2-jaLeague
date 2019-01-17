import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Level1CodingExam2 implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton cow = new JButton("Cow");
	JButton dog = new JButton("Dog");
	JButton cat = new JButton("Cat");
	JButton duck = new JButton("Duck");
	JButton llama = new JButton("Llama");
	
	
	public static void main(String[] args) {
		new Level1CodingExam2().gui();
	}
	
	void gui() {
		cow.addActionListener(this);
		cat.addActionListener(this);
		dog.addActionListener(this);
		duck.addActionListener(this);
		llama.addActionListener(this);
		panel.add(cow);
		panel.add(cat);
		panel.add(dog);
		panel.add(duck);
		panel.add(llama);
		frame.add(panel);
		frame.setTitle("Animal Sounds");
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void playNoise(String soundFile) {
		try {
			AudioClip sound = JApplet.newAudioClip(getClass().getResource(soundFile));
			sound.play();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();
		if (buttonPressed==cow) {
			playNoise("moo.wav");
		}
		else if (buttonPressed==cat) {
			playNoise("meow.wav");
		}
		else if (buttonPressed==dog) {
			playNoise("woof.wav");
		}
		else if (buttonPressed==duck) {
			playNoise("quack.wav");
		}
		else if (buttonPressed==llama) {
			playNoise("llama.wav");
		}
	}
}
