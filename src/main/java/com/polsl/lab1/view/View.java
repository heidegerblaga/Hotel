package com.polsl.lab1.view;

import com.polsl.lab1.Controler.Controler;
import com.polsl.lab1.Models.Accommodation;
import com.polsl.lab1.Models.Client;
import com.polsl.lab1.Models.Room;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.event.*;

/**
 * Class representing a client object.
 *
 * This class represents a client and provides methods to access and modify client information.
 *
 * @author Paweł Pluta
 */
public class View {
    static Controler start = new Controler();

    public static void main(String[] args) {

        JFrame frame = new JFrame("Accommodation Manager");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 800);

        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel titleLabel = new JLabel("Accommodation Manager");
        titleLabel.setBounds(80, 10, 150, 20);
        panel.add(titleLabel);

        JButton addAccommodationButton = new JButton("Add new accommodation");
        addAccommodationButton.setBounds(50, 50, 200, 25);
        panel.add(addAccommodationButton);

        JButton searchClientButton = new JButton("Search client");
        searchClientButton.setBounds(50, 80, 200, 25);
        panel.add(searchClientButton);

        JButton seeClientButton = new JButton("See Client");
        seeClientButton.setBounds(50, 110, 200, 25);
        panel.add(seeClientButton);

        JButton exitButton = new JButton("Exit");
        exitButton.setBounds(50, 140, 200, 25);
        panel.add(exitButton);

        addAccommodationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleAddAccommodation();
            }
        });

        seeClientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleseeClient();
            }
        });

        searchClientButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleSearchClient();
            }
        });





        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    private static void handleAddAccommodation() {
        JFrame addAccommodationFrame = new JFrame("Add New Accommodation");
        addAccommodationFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        addAccommodationFrame.setSize(300, 200);

        JPanel panel = new JPanel();
        addAccommodationFrame.add(panel);
        placeAccommodationComponents(panel);

        addAccommodationFrame.setVisible(true);
    }

    private static void placeAccommodationComponents(JPanel panel) {
        panel.setLayout(null);

        JLabel titleLabel = new JLabel("client data");
        titleLabel.setBounds(80, 10, 150, 20);
        panel.add(titleLabel);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(10, 40, 80, 25);
        panel.add(nameLabel);

        JTextField nameTextField = new JTextField(20);
        nameTextField.setBounds(100, 40, 165, 25);
        panel.add(nameTextField);

        JLabel surnameLabel = new JLabel("Surname:");
        surnameLabel.setBounds(10, 70, 80, 25);
        panel.add(surnameLabel);

        JTextField surnameTextField = new JTextField(20);
        surnameTextField.setBounds(100, 70, 165, 25);
        panel.add(surnameTextField);

        JLabel ageLabel = new JLabel("age:");
        ageLabel.setBounds(10, 100, 80, 25);
        panel.add(ageLabel);

        JTextField ageTextField = new JTextField(20);
        ageTextField.setBounds(100, 100, 165, 25);
        panel.add(ageTextField);

        JLabel idLabel = new JLabel("id:");
        idLabel.setBounds(10, 130, 80, 25);
        panel.add(idLabel);

        JTextField idTextField = new JTextField(20);
        idTextField.setBounds(100, 130, 165, 25);
        panel.add(idTextField);

        JLabel phoneLabel = new JLabel("phone:");
        phoneLabel.setBounds(10, 160, 80, 25);
        panel.add(phoneLabel);

        JTextField phoneTextField = new JTextField(20);
        phoneTextField.setBounds(100, 160, 165, 25);
        panel.add(phoneTextField);

        JLabel maillLabel = new JLabel("maill:");
        maillLabel.setBounds(10, 190, 80, 25);
        panel.add(maillLabel);

        JTextField maillTextField = new JTextField(20);
        maillTextField.setBounds(100, 190, 165, 25);
        panel.add(maillTextField);

        JLabel titleLabel2 = new JLabel("room");
        titleLabel2.setBounds(330, 10, 150, 20);
        panel.add(titleLabel2);


        DefaultListModel<String> listModel = new DefaultListModel<>();


        for(Room element:start.loadRooms())
        {
            listModel.addElement(element.getStandard() +" cap: "+element.getCapacity()+" lvl: "+element.getLvl());

        }

        // Create the JList with the DefaultListModel
        JList<String> list = new JList<>(listModel);

        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        list.setVisibleRowCount(-1);

        JScrollPane scrollPane = new JScrollPane(list);

        scrollPane.setBounds(300,40,150,200);

        panel.add(scrollPane);



        JCheckBox checkBox1 = new JCheckBox("breakfast");
        checkBox1.setBounds(500,20, 100,50);
        checkBox1.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                Integer state = (e.getStateChange()==1?1:0);
            }
        });


        JCheckBox checkBox2 = new JCheckBox("lunch", true);
        checkBox2.setBounds(500,60, 100,50);
        JCheckBox checkBox3 = new JCheckBox("dinner");
        checkBox3.setBounds(500,100, 100,50);
        JCheckBox checkBox4 = new JCheckBox("spa", true);
        checkBox4.setBounds(500,140, 100,50);
        panel.add(checkBox1);
        panel.add(checkBox2);
        panel.add(checkBox3);
        panel.add(checkBox4);


        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(10, 230, 80, 25);
        panel.add(submitButton);

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Validate if all required fields are filled
                    if (nameTextField.getText().isEmpty() || maillTextField.getText().isEmpty()) {
                        throw new IllegalArgumentException("required data");
                    }

                    // Rest of your code
                    Client newcli = new Client(nameTextField.getText(),surnameTextField.getText(), start.toInt(ageTextField.getText()),start.toInt(phoneTextField.getText())
                            , start.toInt(idTextField.getText()),maillTextField.getText());

                    // Rest of your code
                    Accommodation newAcc = new Accommodation(newcli,start.loadRooms().get(list.getSelectedIndex()),checkBox3.isSelected() ? 1:0,checkBox1.isSelected() ? 1:0,checkBox2.isSelected() ? 1:0,checkBox4.isSelected() ? 1:0);

                    // Rest of your code
                    String info = "Client: " + newAcc.getClient().getName() + " " + newAcc.getClient().getSurname() + "\n"
                            + "Room No: " + newAcc.getRoom().getNo() + "\n"
                            + "Email: " + newAcc.getClient().getMaill() + "\n"
                            + "Phone No: " + newAcc.getClient().getPhoneNo() + "\n"
                            + "Breakfast: " + newAcc.getBreakfast() + "\n"
                            + "Lunch: " + newAcc.getLunch() + "\n"
                            + "Dinner: " + newAcc.getDinner() + "\n"
                            + "SPA: " + newAcc.getSpa() + "\n ____________________";

                    start.save("AccommodationData.txt", info);
                } catch (IllegalArgumentException ex) {
                    // Display a dialog with the error message
                    JOptionPane.showMessageDialog(panel, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private static void handleSearchClient() {

        JFrame addSearchFrame = new JFrame("Search client");

        addSearchFrame.setSize(1200, 900);

        JPanel panel = new JPanel();
        addSearchFrame.add(panel);
        placeSearchComponents(panel);

        addSearchFrame.setVisible(true);
    }

    private static void placeSearchComponents(JPanel panel)
    {

        JTextField nameField = new JTextField(20);
        nameField.setBounds(80, 10, 150, 20);
        panel.add(nameField);
        JTextField surnameField = new JTextField(20);
        surnameField.setBounds(80, 25, 150, 20);
        panel.add(surnameField);
        JButton searchButton = new JButton("Search");
        searchButton.setBounds(80, 40, 150, 20);
        panel.add(searchButton);

        searchButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                handleSearchResultClient(nameField.getText(),surnameField.getText());
            }

        });

    }

    private static void handleSearchResultClient(String Name,String Surname) {

        JFrame addSearchFrame = new JFrame("Search result");

        addSearchFrame.setSize(1200, 900);

        JPanel panel = new JPanel();
        addSearchFrame.add(panel);
        placeSearchResultComponents(panel, Name, Surname);

        addSearchFrame.setVisible(true);
    }

    private static void placeSearchResultComponents(JPanel panel,String Name,String Surname) {

        DefaultListModel<String> listModel = new DefaultListModel<>();


        for (Client element : start.SearchClient(Name,Surname,start.loadClients()))
            listModel.addElement(element.getData());

        // Create the JList with the DefaultListModel
        JList<String> list = new JList<>(listModel);

        list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        list.setLayoutOrientation(JList.HORIZONTAL_WRAP);
        list.setVisibleRowCount(-1);

        JScrollPane scrollPane = new JScrollPane(list);

        scrollPane.setBounds(600, 40, 300, 200);

        panel.add(scrollPane);
    }

    private static void handleseeClient() {

        JFrame seeclients = new JFrame("Clients");

        seeclients.setSize(1200, 900);

        JPanel panel = new JPanel();

        seeclients.add(panel);

        placeseeClientComponents(panel);

        seeclients.setVisible(true);
    }

    private static void placeseeClientComponents(JPanel panel) {

        String[] columnNames = {"Name", "Surname", "Age", "Phone No", "ID", "Email"};
        DefaultTableModel tableModel = new DefaultTableModel(columnNames, 0);

        // Add data from the list of clients to the DefaultTableModel
        for (Client client : start.loadClients()) {
            Object[] rowData = {
                    client.getName(),
                    client.getSurname(),
                    client.getAge(),
                    client.getPhoneNo(),
                    client.getId(),
                    client.getMaill()
            };
            tableModel.addRow(rowData);
        }

        // Create the JTable with the DefaultTableModel
        JTable clientTable = new JTable(tableModel);

        // Add the JTable to a JScrollPane
        JScrollPane scrollPane = new JScrollPane(clientTable);

        panel.add(scrollPane);
    }

}
