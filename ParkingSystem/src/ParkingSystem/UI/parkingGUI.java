package ParkingSystem.UI;
import java.util.Calendar;
import java.util.UUID;

import javax.swing.JFrame;

import java.awt.*;
import java.awt.event.ActionEvent;

import javax.swing.*;

import ParkingSystem.Entities.CreditCard;
import ParkingSystem.Entities.Gate;
import ParkingSystem.Entities.GateStatus;
import ParkingSystem.Entities.Ticket;
import ParkingSystem.Entities.TicketStatus;
import ParkingSystem.domain.GateManagement;
import ParkingSystem.domain.PaymentManagement;
import ParkingSystem.domain.TicketManagement;
import ParkingSystem.domain.TicketManager;

public class parkingGUI  extends  JFrame 
{
	
	
	    javax.swing.JButton jButton1;
	    javax.swing.JButton jButton2;
	    javax.swing.JButton jButton3;
	    javax.swing.JButton jButton4;
	    javax.swing.JButton jButton5;
	    javax.swing.JButton jButton7;
	    javax.swing.JLabel jLabel1;
	    javax.swing.JTextField jTextField1;
	    javax.swing.JTextField jTextField2;
	    javax.swing.JTextField jTextField3;
	    javax.swing.JLabel jLabel3;
	    javax.swing.JLabel jLabel2;
	    javax.swing.JLabel jLabel4;
	    javax.swing.JLabel jLabel5;
	    javax.swing.JLabel jLabel6;
	    javax.swing.JLabel jLabel7;
	    javax.swing.JLabel jLabel8;
	    javax.swing.JLabel jLabel9;
	    javax.swing.JLabel jLabel10;
	    javax.swing.JLabel jLabel11;
	    javax.swing.JLabel jLabel12;
	    javax.swing.JLabel jLabel14;
	    javax.swing.JTextField jTextField4;
	    javax.swing.JTextField jTextField5;
	    javax.swing.JTextField jTextField6;
	    javax.swing.JTextField jTextField7;
	    javax.swing.JLabel jLabel13;
	    javax.swing.JTextField jTextField8;
	    javax.swing.JTextField jTextField9;
	    javax.swing.JTextField jTextField10;
	    javax.swing.JTextField jTextField11;
	    javax.swing.JTextField jTextField12;
	    java.awt.Label label1;
	    java.awt.Label label2;
	    java.awt.Label label3;
	    java.awt.Label label4;
	    java.awt.Label label5;
	    java.awt.Label label6;
	    javax.swing.JButton jButton6;

	    javax.swing.JButton jButton8;
	    javax.swing.JButton jButton9;
	    
	    private java.awt.Choice choice1;

	    TicketManager  objticketmanager=new  TicketManager();
	    
  	    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {    
	    	
	    	if(objticketmanager.ticket.getTicektStatus()==TicketStatus.Active )
	    	{
	    		objticketmanager.gate =objticketmanager.gatemanagement.OpenGate(1);
	    	   jTextField3.setText(objticketmanager.gate.gateStatus.toString());
	    	}
	    	else
	    	{
	    		 jTextField3.setText(objticketmanager.gate.gateStatus.toString());
	    	}
	    	    
	   	   
	        // TODO add your =handling code here:
	    }                                        

	    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        // TODO add your handling code here:
	    	
	    	
	     	if(objticketmanager.gate.gateStatus==GateStatus.Open)
	    	{
	     		objticketmanager.gate.gateStatus=GateStatus.Close;
	    	    jTextField3.setText(objticketmanager.gate.gateStatus.toString());
	    	}
	      	    	
	    	if(objticketmanager.gate.gateStatus==GateStatus.Open)
	    	{
	    		objticketmanager.gate.gateStatus=GateStatus.Close;
	    	    jTextField3.setText(objticketmanager.gate.gateStatus.toString());
	    	}
	    	else
	    	{
	    		 jTextField3.setText(objticketmanager.gate.gateStatus.toString());
	    	}
    		  
	    }
	    
	    
	    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {    
	    	
	    	
	    	UUID  ticketID = null;
	    	Ticket ticket=null;
	    	
	    	try
	    	{
	    	   ticketID=  UUID.fromString(choice1.getSelectedItem());
	    	}
	    	catch(Exception  ex)
	    	{
	    		
	    	}
	       
	       for(Ticket t : objticketmanager.ticketmager.getTicketcollection())
	       {
	    	   if(t.getTicektID()==ticketID)
	             {
	    		   ticket =t;
	    	    }
            // TODO add your handling code here:
            }
	       
	       if(ticket!=null)
	       {
	    	   if(ticket.getTicektStatus()==TicketStatus.Active && ticket.getIsPaid()==true)
	    		   
	    	   {
	    		   Gate g=objticketmanager.gatemanagement.ExitGate(1);
	    		   
	    		   JOptionPane.showMessageDialog(null, "Vehicle exited from gate.");
	    		   ticket.deactivatetheTicektStatus();
	    		   objticketmanager.occupancy.decrementOcccupancy();
	    		   
	    		   objticketmanager.gatemanagement.closeGate();
	    		   
	    		  
	    		  	    		  
	    	   }
	       }
	    }
	    
		public void jButton2ActionPerformed(ActionEvent evt) {
			// TODO Auto-generated method stub.
			//  
	   
			String regex = "\\d+";
			Boolean validentry = false;
					
		  if(jTextField4.getText().length()>0)
			
		  {
			if(jTextField4.getText().length()>12  || jTextField4.getText().length()<12 )
			{
				JOptionPane.showMessageDialog(null, "Please enter valid card number");
			
			}
			
			
			boolean  validate=jTextField4.getText().matches("[0-9]+"); ;
			
			if(!validate)
			 {
				JOptionPane.showMessageDialog(null, "Please enter Numeric values only.");
			
			 }
			else
				
			{
				validentry=true;
				
			}
			
	     }
		  
		  else
		  {
			  JOptionPane.showMessageDialog(null, "Credit number is required");
		  }
				
			//JOptionPane.showMessageDialog(null, "My Goodness, this is a pay");
					
		  if(jTextField6.toString().length()>0)
		  {
			  Calendar cal = Calendar.getInstance();
			  
     		  int year = cal.get(Calendar.YEAR);
			  int month = cal.get(Calendar.MONTH);
			
		    
		     String  entermonth[]=new String[2];
		     
		     try
		     {
		    	 String string = jTextField6.getText().toString();
		    	 String[] parts = string.split("/");
		    	 
		    	 if(entermonth.length>0)
		    	 {
		    		 int entedmonth= Integer.parseInt(parts[0]);
		    		 int entedyear= Integer.parseInt(parts[1]);
		    		 
		    		 if(entedyear<year)
		    		 {
		    				JOptionPane.showMessageDialog(null, "Please enter valid month/year.");
		    		 }
		    		 else
		    		 {
		    			 validentry=true;
		    		 }
		    	 }
		    	 else
		    	 {
		    		 JOptionPane.showMessageDialog(null, "Please enter the date  in mm/YYYY format.");
		    	 }
		      }
		     catch(Exception e)
		     {
		    	 
		    	 JOptionPane.showMessageDialog(null, "Please enter valid month/year.");
		     }
		     
		     if(jTextField7.toString().length()>0)
			  {
		    	 boolean  validate=jTextField7.getText().matches("[0-9]+"); ;
					
					if(!validate)
					 {
						JOptionPane.showMessageDialog(null, "Please enter Numeric values only.");
					
					 }
					else
					{
						 if(jTextField7.getText().length()>3 || (jTextField7.getText().length()<3))
								 JOptionPane.showMessageDialog(null, "Entered cvv is incorrect.");
						 else
							 validentry=true;
					}
		    	 
			  }
		     
		     else
		     {
		    	 JOptionPane.showMessageDialog(null, "Please enter cvv.");
		     }
		     
		     	     
		     }
		     
		  if(validentry)
		  {
		      
			  CreditCard  crdeitcard=new CreditCard();
			  crdeitcard.setCCNumner(jTextField4.getText());
			  crdeitcard.setExpiryDate(jTextField6.getText());
			  crdeitcard.setCvvNumber( Integer.parseInt(jTextField7.getText()) );
	 
			  //associating ticket id to credit card id 
			  
			  crdeitcard.setTicketID(objticketmanager.ticket.getTicektID());
			
			  objticketmanager.paymanager.Pay(objticketmanager.ticket);
				
				String amount= String.valueOf(objticketmanager.ticket.getTicketAmount());
				jTextField5.setText(amount);
		  }
			
		}
	  
	
	   public  void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {     
		   
		   
		   if(objticketmanager.occupancy.isParkingfull())
		      {
		    	  jButton1.setVisible(false);
		      }
		   
	        // TODO add your handling code here:
		   
		    jLabel4.setText("Printing Ticket...Please Wait");
		  
		   
		    final Ticket ticket = objticketmanager.ticketmager.createTicket();
		  
		      ticket.activatetheTicektStatus();
		      ticket.generateTicketID();
		      
		      if(ticket!=null && ticket.getTicektStatus()==TicketStatus.Active)
		      {
		    	  objticketmanager.ticket=ticket;
		    	 
		    	  objticketmanager. occupancy.incrementOcccupancy();
		    	 
		    	 String currentCount= Integer.toString(objticketmanager.occupancy.currentParking) ;
		    	 
		    	 label5.setText(currentCount);
		    	  
		   		 Thread ts =new Thread(new Runnable() {
					
					@Override
					public void run() {
						
						try {
						   Thread.sleep(2000);
						   
						    jTextField10.setText(ticket.getTicketID().toString());
						    jTextField11.setText(ticket.getTicektStatus().toString()); 
						    jTextField12.setText(ticket.getEntryTime().toString()); 
							jLabel4.setText("Success..Collect the ticket from slot");
						}
						catch (InterruptedException e) {

						}
						
						
					}
				});
		   		
		   		ts.start();
		   		
		   		
		   		choice1.add(ticket.getTicketID().toString());
		      }
				
		      else
		      {
		    	  jLabel4.setText("Error...Please Retry");
		      }
		    	  
	 
		      
		  
	    }        
	   
	   private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        // TODO add your handling code here:
	    }                                        

	    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        // TODO add your handling code here:
	    }                                        

	    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        // TODO add your handling code here:
	    }                                        

	   
	   private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                         
	        // TODO add your handling code here:
			  Calendar   c=Calendar.getInstance();
				
		      java.util.Date currenttime=c.getTime();
			
		      objticketmanager.ticket.setExitTime(currenttime);
		      objticketmanager.paymanager.setHourlyRate(11);
			  
			  long rate=  objticketmanager.paymanager.calculateParkingDuration(objticketmanager.ticket);
			  objticketmanager.ticket.setTicketAmount(rate);
			
			  
			  objticketmanager.gatemanagement.ExitGate(1);
		      
		     jTextField5.setText(Long.toString(rate));
	    }  
	  
	  
	   
	   private  void IntiliazeWindows() {
			
			
		 	    jLabel3 = new javax.swing.JLabel();
	            jLabel4 = new javax.swing.JLabel();

		        jLabel1 = new javax.swing.JLabel();
		        jTextField1 = new javax.swing.JTextField();
		        jTextField10 = new javax.swing.JTextField();
		        jTextField11 = new javax.swing.JTextField();
		        jTextField12 = new javax.swing.JTextField();
		        jLabel14 = new javax.swing.JLabel();
		        jTextField2 = new javax.swing.JTextField();
		        jButton1 = new javax.swing.JButton();
		        jButton2 = new javax.swing.JButton();
		        jButton3 = new javax.swing.JButton();
		        jButton7 = new javax.swing.JButton();
		        jLabel2 = new javax.swing.JLabel();
		        jLabel3 = new javax.swing.JLabel();
		        jLabel4 = new javax.swing.JLabel();
		        jLabel5 = new javax.swing.JLabel();
		        jLabel6 = new javax.swing.JLabel();
		        jLabel7 = new javax.swing.JLabel();
		        jLabel8= new javax.swing.JLabel();
		        jButton4 = new javax.swing.JButton();
		        jButton5 = new javax.swing.JButton();
		        jTextField3 = new javax.swing.JTextField();
		  
		        jLabel9 = new javax.swing.JLabel();
		        jLabel10 = new javax.swing.JLabel();
		        jLabel11 = new javax.swing.JLabel();
		        jLabel12 = new javax.swing.JLabel();
		        jTextField4 = new javax.swing.JTextField();
		        jTextField5 = new javax.swing.JTextField();
		        jTextField6 = new javax.swing.JTextField();
		        jTextField7 = new javax.swing.JTextField();
		        jLabel13 = new javax.swing.JLabel();
		        jTextField8 = new javax.swing.JTextField();
		        jTextField9 = new javax.swing.JTextField();
		        
		        label1 = new java.awt.Label();
		        label2 = new java.awt.Label();
		        label3 = new java.awt.Label();
		        label4 = new java.awt.Label();
		        label5 = new java.awt.Label();
		        label6 = new java.awt.Label();
		        jButton6 = new javax.swing.JButton();
		        jButton8 = new javax.swing.JButton();
		        jButton9 = new javax.swing.JButton();
		        jLabel14 = new javax.swing.JLabel();
		        
		        choice1 = new java.awt.Choice();
		        
		        choice1.add("Select the ticket");
		        
		        jButton5.setText("Close Gate");
		        
		        jButton5.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton5ActionPerformed(evt);
		            }
		        });
		        
		        
		        jButton3.setText("Exit");
		        jLabel4.setText("Ticket :");
		        
		        jLabel5.setText("Ticket ID");
			    jLabel6.setText(" Ticket Status");
			    jLabel7.setText("Entry time");
		        

		       // setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		        jLabel1.setText("PlateID");

		        jTextField1.setText("jtextnamepalte");
		        jTextField1.setToolTipText("");

		        jLabel2.setText("Parking Status");

		        jButton1.setText("Print Ticket");
		        jButton1.setToolTipText("Print Ticket");
		        
		        jButton1.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton1ActionPerformed(evt);
		            }
		        });

		        
		       
		        jButton2.setText("Payment");
		        jButton2.setToolTipText("");
		        jButton2.setActionCommand("Pay");
		        jButton2.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton2ActionPerformed(evt);
		            }

				
		        });


		        jButton3.setText("Exit");
		        jButton3.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		            	jButton3ActionPerformed(evt);
		            }
		        });
		      

		    
		        
		        jLabel4.setText("Ticket: ");
		        jButton4.setText("Open Gate");
		        jButton4.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton4ActionPerformed(evt);
		            }
		        });

		        
		        
		        jButton5.setText("Close Gate");
		        jButton5.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton5ActionPerformed(evt);
		            }
		        });

		        jLabel8.setText("Gate Status");

		        jLabel9.setText("Credit Card Number");

		        jLabel10.setText("Amount");
		        jLabel10.setToolTipText("");

		        jLabel11.setText("Enter Expiry Date (MM-yyyy)");

		        jLabel12.setText("CVV");

		        jLabel13.setText("Payment Status");

		        label1.setText("Status");
		        

		        jLabel8.setText("Gate Status");
		        
		      

		        label1.setText("Status");

		        jButton7.setText("Calculate Fare");
		        jButton7.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton7ActionPerformed(evt);
		            }
		        });

		        jTextField10.setText("");

		        jTextField11.setText("");

		        jTextField12.setText("");


		        label2.setText("Exiting ");

		        label3.setText("Select TicketID");
		        label3.setVisible(false);

		        label4.setText("Select TicketID");

		        label6.setName(""); // NOI18N
		        label6.setText("Parking Count");
		        label5.setText("0");
		        label5.setFont(new Font("Serif", Font.BOLD, 25));
		 
		        label6.setText("Parking Count");
		        
		        jButton6.setText("Gate1");
		        jButton6.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton6ActionPerformed(evt);
		            }
		        });

		        jButton8.setText("Gate2");
		        jButton8.setToolTipText("");
		        jButton8.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton8ActionPerformed(evt);
		            }
		        });

		        jButton9.setText("Gate3");
		        jButton9.setToolTipText("");
		        jButton9.addActionListener(new java.awt.event.ActionListener() {
		            public void actionPerformed(java.awt.event.ActionEvent evt) {
		                jButton9ActionPerformed(evt);
		            }
		        });

		        jLabel14.setText("Select Entry gate");
		        jLabel14.setToolTipText("");

		        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		        getContentPane().setLayout(layout);
		        layout.setHorizontalGroup(
		            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(layout.createSequentialGroup()
		                .addGap(32, 32, 32)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jLabel12)
		                    .addComponent(jLabel13)
		                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jLabel9)
		                    .addGroup(layout.createSequentialGroup()
		                        .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addGap(9, 9, 9)))
		                .addGap(18, 18, 18)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
		                        .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                        .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.LEADING)
		                        .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
		                        .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING)
		                        .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
		                    .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE))
		                .addGap(0, 0, Short.MAX_VALUE))
		            .addGroup(layout.createSequentialGroup()
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addGroup(layout.createSequentialGroup()
		                        .addGap(126, 126, 126)
		                        .addComponent(jLabel1))
		                    .addGroup(layout.createSequentialGroup()
		                        .addGap(81, 81, 81)
		                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                .addGap(20, 20, 20)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addGroup(layout.createSequentialGroup()
		                        .addComponent(jLabel3)
		                        .addContainerGap())
		                    .addGroup(layout.createSequentialGroup()
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addGroup(layout.createSequentialGroup()
		                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
		                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
		                            .addGroup(layout.createSequentialGroup()
		                                .addGap(3, 3, 3)
		                                .addComponent(jButton6)
		                                .addGap(18, 18, 18)
		                                .addComponent(jButton8)
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                                .addComponent(jButton9)))
		                        .addGap(58, 58, 58)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addGroup(layout.createSequentialGroup()
		                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.LEADING)
		                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
		                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                                            .addComponent(label6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
		                                            .addComponent(label5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
		                                        .addGap(0, 0, Short.MAX_VALUE)))
		                                .addGap(55, 55, 55))
		                            .addGroup(layout.createSequentialGroup()
		                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                                    .addComponent(jLabel2)
		                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
		                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
		            .addGroup(layout.createSequentialGroup()
		                .addGap(60, 60, 60)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
		                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addComponent(jLabel6)
		                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addComponent(jTextField11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jTextField12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
		                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		        );
		        layout.setVerticalGroup(
		            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		            .addGroup(layout.createSequentialGroup()
		                .addContainerGap()
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                    .addComponent(jLabel1))
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                    .addGroup(layout.createSequentialGroup()
		                        .addGap(15, 15, 15)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                        .addComponent(jButton1)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE))
		                    .addGroup(layout.createSequentialGroup()
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
		                        .addComponent(jLabel2)
		                        .addGap(18, 18, 18)
		                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
		                .addComponent(jLabel3)
		                .addGap(5, 5, 5)
		                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                    .addGroup(layout.createSequentialGroup()
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                            .addComponent(jLabel5)
		                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addGroup(layout.createSequentialGroup()
		                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                                    .addComponent(jLabel6)
		                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                                    .addComponent(jLabel7)
		                                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                                .addGap(18, 18, 18)
		                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                                    .addComponent(jButton4)
		                                    .addComponent(jButton5))
		                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                            .addGroup(layout.createSequentialGroup()
		                                .addComponent(label5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
		                                .addGap(26, 26, 26)
		                                .addComponent(jLabel8)
		                                .addGap(28, 28, 28)
		                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(choice1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
		                        .addComponent(jButton7)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
		                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                        .addGap(18, 18, 18)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                            .addComponent(jLabel9)
		                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                        .addGap(18, 18, 18)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                            .addComponent(jLabel10)
		                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                        .addGap(18, 18, 18)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addComponent(jLabel11)
		                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
		                            .addComponent(jLabel12)
		                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
		                        .addGap(25, 25, 25)
		                        .addComponent(jButton2)
		                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
		                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
		                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                            .addComponent(jLabel13))
		                        .addGap(18, 18, 18)
		                        .addComponent(jButton3)
		                        .addContainerGap(23, Short.MAX_VALUE))
		                    .addGroup(layout.createSequentialGroup()
		                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
		                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
		        );

		        jLabel3.getAccessibleContext().setAccessibleName("lblprintTicket");
		        jLabel4.getAccessibleContext().setAccessibleName("lblticketid");
		        jLabel5.getAccessibleContext().setAccessibleName("lblticketID");
		        jLabel6.getAccessibleContext().setAccessibleName("lblticketInTime");
		        jLabel7.getAccessibleContext().setAccessibleName("lblticketStatus");


		        objticketmanager.occupancy.setParkingCapacity(10);
		        
		     
		        
			
		}


	public static void main(String[] args) throws InterruptedException {
		
		 // Variables declaration - do not modify                     
	
	    // End of variables declaration          
		parkingGUI  objgui=new parkingGUI();
		
		//Ensure the gatestatus
		
		
		objgui.IntiliazeWindows();
		
		objgui.setSize(800, 850);// 
		
		objgui.show();
		

		PaymentManagement  pay=new PaymentManagement();
      	//long result=pay.calculateParkingDuration(03/01/2013, 03/01/2013);
		// TODO Auto-generated method stub
	    // long parkingDuration=(Date.  -  datein.getTime());
		
		 GateManagement  g=new GateManagement();
         TicketManagement   t=new TicketManagement();
	
		//IntiliazeWindows();
		
		/*
	
		Calendar   c=Calendar.getInstance();
			
			
			java.util.Date currenttime=c.getTime();
			//System.out.println(currenttime);
			
			//Thread.sleep(60000);
			Calendar   c2=Calendar.getInstance();
			
			java.util.Date nexttime=c2.getTime();
		   //System.out.println(nexttime);
			
			
			long timediff=(nexttime.getTime()-currenttime.getTime())/(60 * 1000);
			
			//System.out.println(timediff);
			 * 
			 
		 */
		
	}

	
	    

}
