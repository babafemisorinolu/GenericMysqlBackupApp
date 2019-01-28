package utils;

import java.io.IOException;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 * REFERENCE : https://omindu.wordpress.com/2011/06/27/mysql-database-backup-restore-using-java/
 */
public class BackUpSQL {

    /**
     * Here -u, -p, -B, -r are options to indicate that we are inserting the
     * database username, password, database name and location to save the
     * backup respectively. The --add-drop-database option is to create a
     * complete backup. It means that when we are restoring the backup file, if
     * the database does not exist in that particular database the restoring
     * process itself create the database automatically.
     * @param MYSQLDUMP_LOCATION
     * @param dbName
     * @param dbUserName
     * @param dbPassword
     * @param path
     * @return 
     */
    public boolean backupDB(String MYSQLDUMP_LOCATION,String dbName, String dbUserName, String dbPassword, String path) {

        
        
        String executeCmd = MYSQLDUMP_LOCATION+" -u " + dbUserName + " -p" + dbPassword + " --add-drop-database -B " + dbName + " -r " + path;
        
        if(dbPassword.isEmpty()){
            executeCmd = MYSQLDUMP_LOCATION+" -u " + dbUserName + " --add-drop-database -B " + dbName + " -r " + path;
        }
        
        System.out.println(executeCmd);
        Process runtimeProcess;
        try {

            runtimeProcess = Runtime.getRuntime().exec(executeCmd);
            int processComplete = runtimeProcess.waitFor();

            if (processComplete == 0) {
                System.out.println("Backup created successfully");
                return true;
            } else {
                System.out.println("Could not create the backup");
            }
        } catch (IOException | InterruptedException ex) {
            ex.printStackTrace();
        }

        return false;
    }
}
