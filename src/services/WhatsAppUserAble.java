package services;

        import classes.Person;
        import classes.WhatsAppUser;
        import classes.WhatsAppUser;

        import java.util.List;

public interface WhatsappUzerAble {

    String greateWhatsappAccount( WhatsappUser whatsappUsers,List<Person>people);
    List<WhatsAppUser>getWhatsAppUser();
    WhatsAppUser getProfil(String pasword,List<WhatsAppUser>whatsAppUsers);
    String getMAssege(String password,String name,List<String> massege,List<WhatsappUzer>uzers,List<WhatsappUzer>uzers2);
    String greateWhatsappAccount(WhatSappUser whatsappUzers, List<Person>people);
    List<WhatSappUser>getWhatsappUzer();
    WhatSappUser getProfil(String pasword, List<WhatSappUser>whatsappUzers);
    String getMAssege(String password, String name, List<String> massege, List<WhatSappUser>uzers, List<WhatSappUser>uzers2);

}