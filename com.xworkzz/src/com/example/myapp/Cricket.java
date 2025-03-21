package com.example.myapp;

public class Cricket {

        Ticket ticket;

        Cricket(Ticket ticket) {
            this.ticket = ticket;
        }

        void watch() {
            if (ticket != null) {
                ticket.buy();

            }}

        void profit() {
            if (ticket != null) {
                ticket.sell();
            }

            System.out.println("sold ticket");
        }
    }

