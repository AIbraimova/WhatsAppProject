package classes;
import enums.WhatsAppStatus;
import java.util.ArrayList;
import java.util.List;

public class WhatsappUser {
    public class WhatSappUser {
        private int id;
        private String phoneNumber;
        private String uzerName;
        private String userName;
        private WhatsAppStatus whatsappStatus;
        private String password;
        private ArrayList<String> message ;


        public WhatsAppUser(int id, String phoneNumber, String uzerName, WhatsAppStatus whatsappStatus, String password, List<java8.classes.Person>people) {
    public WhatSappUser(int id, String phoneNumber, String uzerName, WhatsAppStatus whatsappStatus, String password, List<Person> people) {
                for (java8.classes.Person person : people) {
                    if(person.getId()== id){
                        if (person.getId() == id) {
                            this.id = id;
                            this.phoneNumber = phoneNumber;
                            this.uzerName = uzerName;
                            this.userName = uzerName;
                            this.whatsappStatus = whatsappStatus;
                            this.password = password;
                        }else {
                        } else {

                        }
                    }
                }
                public int getId() {
                    return id;
                }
                public void setId(int id) {
                    this.id = id;
                }
                public String getPhoneNumber() {
                    return phoneNumber;
                }
                public void setPhoneNumber(String phoneNumber) {
                    this.phoneNumber = phoneNumber;
                }

                public String getUzerName() {
                    return uzerName;
                    public String getUserName() {
                        return userName;
                    }

                    public void setUzerName(String uzerName) {
                        this.uzerName = uzerName;
                        public void setUserName(String userName) {
                            this.userName = userName;
                        }

                        public WhatsAppStatus getWhatsappStatus() {
                            return whatsappStatus;
                        }
                        public void setWhatsappStatus(WhatsAppStatus whatsAppStatus) {
                            this.whatsappStatus = whatsappStatus;
                        }
                        public String getPassword() {
                            return password;
                        }
                        public void setPassword(String password) {
                            this.password = password;
                        }
                        public ArrayList<String> getMassege() {
                            return message;
                        }
                        public void setMassege(ArrayList<String> message) {
                            this.message = message;
                        }

                        @Override
                        public String toString() {
                            return "\n<<<<<<< WHATSAPP ACCOUNT >>>>>>>>"+
                                    "\nID : "+id+
                                    "\nPHONE NUMBER : "+phoneNumber+
                                    "\nUZER NAME : "+uzerName+
                                    "\nWHATSAPP STATUS : "+whatsappStatus+
                                    "\nPASWORD : "+password+
                                    "\nMASSEGE : "+message+
                            return "\n<<<<<<< WHATSAPP ACCOUNT >>>>>>>>" +
                                    "\nID : " + id +
                                    "\nPHONE NUMBER : " + phoneNumber +
                                    "\nUZER NAME : " + userName +
                                    "\nWHATSAPP STATUS : " + whatsappStatus +
                                    "\nPASWORD : " + password +
                                    "\nMASSEGE : " + message +
                                    "\n*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*";
                        }
                    }