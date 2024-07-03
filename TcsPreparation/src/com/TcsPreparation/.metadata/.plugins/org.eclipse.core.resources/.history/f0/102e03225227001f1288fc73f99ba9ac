package com.BusResrvation;

import java.awt.*;
import java.awt.event.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import java.util.List;

public class BusReservationGUI extends Frame implements ActionListener {
    private BusReservationSystem system;
    private TextField busIdField, nameField, ageField, dateField, amountField, gstField, rescheduleField, cancelField;
    private TextArea bookingArea;
    private Button bookButton, viewButton, cancelButton, rescheduleButton;

    public BusReservationGUI() {
        system = new BusReservationSystem();
        system.addBus(new Bus(1, "Express Bus", 5));
        system.addBus(new Bus(2, "City Bus", 10));

        setLayout(new FlowLayout());

        add(new Label("Bus ID:"));
        busIdField = new TextField(10);
        add(busIdField);

        add(new Label("Name:"));
        nameField = new TextField(10);
        add(nameField);

        add(new Label("Age:"));
        ageField = new TextField(10);
        add(ageField);

        add(new Label("Date (yyyy-mm-dd):"));
        dateField = new TextField(10);
        add(dateField);

        add(new Label("Amount:"));
        amountField = new TextField(10);
        add(amountField);

        add(new Label("GST (%):"));
        gstField = new TextField(10);
        add(gstField);

        bookButton = new Button("Book Seat");
        bookButton.addActionListener(this);
        add(bookButton);

        viewButton = new Button("View Bookings");
        viewButton.addActionListener(this);
        add(viewButton);

        add(new Label("Cancel Booking (Booking Index):"));
        cancelField = new TextField(10);
        add(cancelField);

        cancelButton = new Button("Cancel Booking");
        cancelButton.addActionListener(this);
        add(cancelButton);

        add(new Label("Reschedule Booking (Booking Index & New Date):"));
        rescheduleField = new TextField(10);
        add(rescheduleField);

        rescheduleButton = new Button("Reschedule Booking");
        rescheduleButton.addActionListener(this);
        add(rescheduleButton);

        bookingArea = new TextArea(10, 50);
        add(bookingArea);

        setTitle("Bus Reservation System");
        setSize(600, 400);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == bookButton) {
            try {
                int busId = Integer.parseInt(busIdField.getText());
                String name = nameField.getText();
                int age = Integer.parseInt(ageField.getText());
                Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateField.getText());
                double amount = Double.parseDouble(amountField.getText());
                double gst = Double.parseDouble(gstField.getText());

                Passenger passenger = new Passenger(name, age);
                Payment payment = new Payment(amount, gst);
                boolean success = system.bookSeat(busId, passenger, date, payment);

                if (success) {
                    bookingArea.setText("Booking successful for " + name + " on Bus ID " + busId + ".\n");
                } else {
                    bookingArea.setText("Booking failed. No available seats on Bus ID " + busId + ".\n");
                }
            } catch (NumberFormatException | ParseException e) {
                bookingArea.setText("Invalid input. Please enter valid data.\n");
            }
        } else if (ae.getSource() == viewButton) {
            StringBuilder bookingsList = new StringBuilder();
            List<Booking> bookings = system.getBookings();
            if (bookings.isEmpty()) {
                bookingArea.setText("No bookings available.\n");
            } else {
                for (int i = 0; i < bookings.size(); i++) {
                    bookingsList.append(i + 1).append(". ").append(bookings.get(i).toString()).append("\n");
                }
                bookingArea.setText(bookingsList.toString());
            }
        } else if (ae.getSource() == cancelButton) {
            try {
                int bookingIndex = Integer.parseInt(cancelField.getText()) - 1;
                if (bookingIndex >= 0 && bookingIndex < system.getBookings().size()) {
                    Booking booking = system.getBookings().get(bookingIndex);
                    system.cancelBooking(booking);
                    bookingArea.setText("Cancelled booking for " + booking.getPassenger().getName() + ".\n");
                } else {
                    bookingArea.setText("Invalid booking index.\n");
                }
            } catch (NumberFormatException e) {
                bookingArea.setText("Invalid input. Please enter a valid booking index.\n");
            }
        } else if (ae.getSource() == rescheduleButton) {
            try {
                String[] rescheduleData = rescheduleField.getText().split(",");
                int bookingIndex = Integer.parseInt(rescheduleData[0].trim()) - 1;
                Date newDate = new SimpleDateFormat("yyyy-MM-dd").parse(rescheduleData[1].trim());

                if (bookingIndex >= 0 && bookingIndex < system.getBookings().size()) {
                    Booking booking = system.getBookings().get(bookingIndex);
                    system.rescheduleBooking(booking, newDate);
                    bookingArea.setText("Rescheduled booking for " + booking.getPassenger().getName() + " to " + newDate + ".\n");
                } else {
                    bookingArea.setText("Invalid booking index.\n");
                }
            } catch (NumberFormatException | ParseException | ArrayIndexOutOfBoundsException e) {
                bookingArea.setText("Invalid input. Please enter a valid booking index and date in the format 'index, yyyy-MM-dd'.\n");
            }
        }
    }

    public static void main(String[] args) {
        new BusReservationGUI();
    }
}
