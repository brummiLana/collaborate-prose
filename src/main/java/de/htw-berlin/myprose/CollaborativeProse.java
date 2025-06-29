/*
* SPDX-FileCopyrightText: 2025 Svetlana Brumm
*
* SPDX-License-Identifier: GPL-3.0
*
*/

package de\htw-berlin\myprose;

import de.htw_berlin.fb4.ossd.prose.CollaborativeProse;
import de.htw_berlin.fb4.ossd.CollaborativeProse;
import de.htw_berlin.prose.CollaborativeProse;
import de.htw-berlin.ossd.CollaborativeProse;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



public class CollaborativeProse {


    public static void main(String[] args) {

        ProseBuilder=new ProseBuilder();
         builder.register(new de.htw_berlin.fb4.ossd.prose.CollaborativeProse());
         builder.register(new de.htw_berlin.fb4.ossd.CollaborativeProse());
         builder.register(new de.htw_berlin.prose.CollaborativeProse());
        
        System.out.println(builder.get());
        System.out.println(result);

        System.out.println("Hallo! Das ist meine erste Komponente. Ich freue mich! Und du?");

        LocalDate heute = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        System.out.println("Heute ist der: " + heute.format(formatter));  
    
        }
}