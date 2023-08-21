package GK_ThaiKe;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Canvas;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BatDau extends JFrame {

	private JPanel contentPane;
	private JTextField txtNhapTen;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BatDau frame = new BatDau();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	private MaHoa batDau;

	public BatDau() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 437);
		setTitle("Ứng Dụng Mã Hoá");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("NONG LAM\r\n\r\n    University\r\n");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 23));
		lblNewLabel.setForeground(new Color(255, 128, 0));
		lblNewLabel.setBounds(273, 74, 225, 126);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("An toàn và bảo mật hệ thống thông tin");
		lblNewLabel_1.setToolTipText("An toàn và bảo mật hệ thống thông tin\r\n");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setForeground(new Color(0, 0, 255));
		lblNewLabel_1.setBounds(233, 177, 343, 38);
		contentPane.add(lblNewLabel_1);

		txtNhapTen = new JTextField();
		txtNhapTen.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNhapTen.setText("Nhập tên:");
		txtNhapTen.setBounds(300, 225, 154, 19);
		contentPane.add(txtNhapTen);
		txtNhapTen.setColumns(10);

		JButton btnNewButton = new JButton("Bắt Đầu");
		batDau = new MaHoa();
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton) {
					batDau.setVisible(true);
				}
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {

		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.RED);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(250, 306, 85, 21);
		contentPane.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Thoát");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==btnNewButton_1) {
					System.exit(0);
				}
					
			}
		});
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.setBackground(Color.PINK);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(427, 306, 85, 21);
		contentPane.add(btnNewButton_1);

		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\User\\Downloads\\h1.png"));
		lblNewLabel_2.setBounds(10, 106, 213, 254);
		contentPane.add(lblNewLabel_2);
	}
}
