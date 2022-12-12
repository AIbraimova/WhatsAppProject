package java8.services.impl;

import java8.classes.Person;
import services.WhatsappUzerAble;

import java.util.ArrayList;
import java.util.List;

public class WhatsappUzerServices implements WhatsappUzerAble {
    List<WhatsappUser>whatsappUzers = new ArrayList<>();
    List<WhatSappUser>whatsappUzers = new ArrayList<>();
    List<String>whatsappMassege = new ArrayList<>();

    @Override
    public String greateWhatsappAccount(WhatsappUzer whatsappUzer, List<Person>people) {
        public String greateWhatsappAccount(WhatSappUser whatsappUzer, List<Person>people) {
            if (whatsappUzer.getId()!=0){
                this.whatsappUzers.add(whatsappUzer);
                return "Successful!!!";
            }else {
                return "Account created successfully!!!";
            }
        }

        @Override
        public List<WhatsappUzer> getWhatsappUzer() {
            public List<WhatSappUser> getWhatsappUzer() {
                return this.whatsappUzers;
            }

            @Override
            public WhatsappUzer getProfil(String pasword,List<WhatsappUzer> whatsappUzers) {
                for (WhatsappUzer whatsappUzer : whatsappUzers) {
                    public WhatSappUser getProfil(String pasword, List<WhatSappUser> whatsappUzers) {
                        for (WhatSappUser whatsappUzer : whatsappUzers) {
                            if(whatsappUzer.getPassword().equals(pasword)){
                                return whatsappUzer;
                            }
                        }
                        return null;
                    }

                    @Override
                    public String getMAssege(String password,String name,List<String> massege, List<WhatsappUzer> uzers,List<WhatsappUzer>uzers2) {
                        for (WhatsappUzer uzer : uzers) {
                            public String getMAssege(String password, String name, List<String> massege, List<WhatSappUser> uzers, List<WhatSappUser>uzers2) {
                                for (WhatSappUser uzer : uzers) {

                                    for (WhatsappUzer whatsappUzer : uzers2) {
                                        for (WhatSappUser whatsappUzer : uzers2) {
                                            if (uzer.getPassword().equals(password)) {
                                                if (whatsappUzer.getUzerName().equals(name)) {
                                                    whatsappMassege.add(uzer.getUzerName()+" : "+massege);
                                                    if (whatsappUzer.getUserName().equals(name)) {
                                                        whatsappMassege.add(uzer.getUserName()+" : "+massege);

                                                        whatsappUzer.setMassege((ArrayList<String>) this.whatsappMassege);
                                                        return "Message was sent!!";
                                                    }
                                                }
                                            }
                                        }
                                        return null;
                                    }
                                }