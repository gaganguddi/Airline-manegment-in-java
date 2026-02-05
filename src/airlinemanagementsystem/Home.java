package airlinemanagementsystem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


public class Home  extends JFrame implements ActionListener{
    
    public Home(){
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("airlinemanagementsystem/icons/front.jpg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0, 0, 1600, 800);
        add(image);
        
        JLabel heading = new JLabel("AIR INDIA WELLCOMES YOU ");
        heading.setBounds(570, 100, 10000, 40);
        heading.setForeground(Color.BLACK);
        heading.setFont(new Font("Tahoma", Font.BOLD, 36));
        image.add(heading);
        
        JLabel heading1 = new JLabel("_______________________");
        heading1.setBounds(570, 100, 10000, 40);
        heading1.setForeground(Color.black);
        heading1.setFont(new Font("Tahoma", Font.BOLD, 36));
        image.add(heading1);
        
        JMenuBar menubar = new JMenuBar();
        menubar.setForeground(Color.BLUE);
        
        setJMenuBar(menubar);
        JMenu details = new JMenu("Details");
        details.setFont(new Font("Tahoma", Font.BOLD, 15));
        menubar.add(details);
        
        JMenuItem flightDetails = new JMenuItem("FlightDetails");
        flightDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
        flightDetails.addActionListener(this);
        details.add(flightDetails);
        
        JMenuItem customerDetails = new JMenuItem("Add Customer Details");
        customerDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
        customerDetails.addActionListener(this);
        details.add(customerDetails);
        
        JMenuItem bookFlight = new JMenuItem("Book Flight");
        bookFlight.setFont(new Font("Tahoma", Font.BOLD, 15));
        bookFlight.addActionListener(this);
        details.add(bookFlight);
        
        JMenuItem journeyDetails = new JMenuItem("Journey Details");
        journeyDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
        journeyDetails.addActionListener(this);
        details.add(journeyDetails);
        
        JMenuItem ticketCancellation = new JMenuItem("Cancel Ticket");
        ticketCancellation.setFont(new Font("Tahoma", Font.BOLD, 15));
        ticketCancellation.addActionListener(this);
        details.add(ticketCancellation);
        
        JMenu ticket = new JMenu("Ticket");
        ticket.setFont(new Font("Tahoma", Font.BOLD, 20));
        menubar.add(ticket);
        
        JMenuItem boardingPass = new JMenuItem("Boarding Pass");
        boardingPass.setFont(new Font("Tahoma", Font.BOLD, 15));
        boardingPass.addActionListener(this);
        ticket.add(boardingPass);
        
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae) {
         String text = ae.getActionCommand();
        
        if (text.equals("Add Customer Details")) {
            new AddCustomer();
        } else if (text.equals("FlightDetails")) {
            new FlightInfo();
        } else if (text.equals("Book Flight")) {
            new BookFlight();
        }else if (text.equals("Journey Details")) {
            new JourneyDetails();
        }else if (text.equals("Cancel Ticket")) {
            new Cancel();
        }else if (text.equals("Boarding Pass")) {
            new BoardingPass();
        }
        
     }
    public static void main(String[] args){
        new Home();
    }
}
