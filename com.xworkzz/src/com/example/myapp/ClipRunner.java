package com.example.myapp;

public class ClipRunner {
      public static void main(String[] args) {
            // Create 5 clips
            Clip[] clips = {
                    new Clip(Color.RED),
                    new Clip(Color.GREEN),
                    new Clip(Color.RED),
                    new Clip(Color.BLACK),
                    new Clip(Color.BLACK)
            };


            Pushpa pushpa = new Pushpa();
            pushpa.Clip(clips);


            Ticket ticket = new Ticket(TicketType.XYZ,100.0);
            Cricket cricket = new Cricket(ticket);
            cricket.watch();
            cricket.profit();
            Brush brush = new Brush(BrushColor.WHITE);


            Virat virat = new Virat(brush, clips, ticket, cricket);
            System.out.println("playing");
            virat.play();

            System.out.println(" Cleaning");
            virat.clean();

            System.out.println("relaxing");
            virat.relax();
        }
    }

