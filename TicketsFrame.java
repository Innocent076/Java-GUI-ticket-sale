
package za.ac.tut.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;


public class TicketsFrame extends JFrame{
    private JPanel headingPnl;
    private JPanel namePnl;
    private JPanel surnamePnl;
    private JPanel cellphonePnl;
    private JPanel customerDetailsPnl;
    private JPanel homeTeamPnl;
    private JPanel awayTeamPnl;
    private JPanel ticketCostPnl;
    private JPanel numTicketsPnl;
    private JPanel totAmountPnl;
    private JPanel ticketsPnl;
    private JPanel ticketsBtnsCombinedPnl;
    private JPanel btnsPnl;
    private JPanel mainPnl;
    
    //create labels
    private JLabel headingLbl;
    private JLabel nameLbl;
    private JLabel surnameLbl;
    private JLabel cellPhoneLbl;
    private JLabel homeTeamLbl;
    private JLabel awayTeamLbl;
    private JLabel tickectCostLbl;
    private JLabel numTicketsLbl;
    private JLabel totAmountLbl;
    
    //create textFields
    private JTextField nameTxtFld;
    private JTextField surnameTxtFld;
    private JTextField cellPhoneTxtFld;
    private JTextField homeTeamTxtFld;
    private JTextField awayTeamTxtFld;
    private JTextField ticketCostTxtFld;
    private JTextField totAmountTxtFld;
    
    //create a slider
    private JSlider numTicketSld;
    
    //create buttons
    private JButton buyBtn;
    private JButton clearBtn;
    private JButton exitBtn;
    
    //now construct the frame

    public TicketsFrame() {
        setTitle("Ticket Sales");
        setSize(600,650);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(true);
        
        //create panels
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        namePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        surnamePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        cellphonePnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        customerDetailsPnl = new JPanel(new GridLayout(3,1,1,1));
        customerDetailsPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 2), "Customer details"));
        
        homeTeamPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        awayTeamPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        ticketCostPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        numTicketsPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        totAmountPnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        
        ticketsPnl = new JPanel(new GridLayout(5,1,1,1));
        ticketsPnl.setBorder(new TitledBorder(new LineBorder(Color.BLUE, 2), "Tickets details"));
        
        btnsPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        ticketsBtnsCombinedPnl = new JPanel(new BorderLayout());
        mainPnl = new JPanel(new BorderLayout());
        
        //create labels
        headingLbl = new JLabel("Soccer Match Tickets");
        headingLbl.setFont(new Font(Font.SERIF,Font.BOLD + Font.ITALIC,40));
        headingLbl.setForeground(Color.CYAN);
        
        nameLbl = new JLabel("Name:   ");
        surnameLbl = new JLabel("Surname: ");
        cellPhoneLbl = new JLabel("Cellphone NO: ");
        homeTeamLbl = new JLabel("Home team: ");
        awayTeamLbl = new JLabel("Away Team: ");
        tickectCostLbl = new JLabel("Cost Price: R");
        numTicketsLbl = new JLabel("Number of tickets required: ");
        totAmountLbl = new JLabel("Total amount Due:R");
        
        //creat text fields
        nameTxtFld = new JTextField(10);
        nameTxtFld.setFocusable(true);
        surnameTxtFld = new JTextField(10);
        cellPhoneTxtFld = new JTextField(10);
        homeTeamTxtFld = new JTextField(10);
        awayTeamTxtFld = new JTextField(10);
        ticketCostTxtFld = new JTextField(10);
        
        totAmountTxtFld = new JTextField(20);
        totAmountTxtFld.setText("To be calculated later");
        totAmountTxtFld.setEditable(false);
        
        //create  Slider
        numTicketSld = new JSlider(1,20);
        
        //create buttons
        buyBtn = new JButton("Buy");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        //add componants to their respective panels
        headingPnl.add(headingLbl);
        
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);
        
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);
        
        cellphonePnl.add(cellPhoneLbl);
        cellphonePnl.add(cellPhoneTxtFld);
        
        
        customerDetailsPnl.add(namePnl); //first collective panel
        customerDetailsPnl.add(surnamePnl);
        customerDetailsPnl.add(cellphonePnl);
        
        homeTeamPnl.add(homeTeamLbl);
        homeTeamPnl.add(homeTeamTxtFld);
        
        awayTeamPnl.add(awayTeamLbl);
        awayTeamPnl.add(awayTeamTxtFld);
        
        ticketCostPnl.add(tickectCostLbl);
        ticketCostPnl.add(ticketCostTxtFld);
        
        numTicketsPnl.add(numTicketsLbl);
        numTicketsPnl.add(numTicketSld);
        
        totAmountPnl.add(totAmountLbl);
        totAmountPnl.add(totAmountTxtFld);
        
        ticketsPnl.add(homeTeamPnl); //second collective panel
        ticketsPnl.add(awayTeamPnl);
        ticketsPnl.add(ticketCostPnl);
        ticketsPnl.add(numTicketsPnl);
        ticketsPnl.add(totAmountPnl);
        
        btnsPnl.add(buyBtn);
        btnsPnl.add(clearBtn);
        btnsPnl.add(exitBtn);
        
        
        ticketsBtnsCombinedPnl.add(ticketsPnl, BorderLayout.CENTER); //third collective panel
        ticketsPnl.add(btnsPnl, BorderLayout.SOUTH);
        
        mainPnl.add(headingPnl, BorderLayout.NORTH);
        mainPnl.add(customerDetailsPnl, BorderLayout.CENTER);
        mainPnl.add(ticketsBtnsCombinedPnl, BorderLayout.SOUTH);
        
        
        add(mainPnl);
        
        
        setVisible(true);
    } 
}
