## Generic Mysql Backup App v1.0 : JavaFX

<img src="https://github.com/babafemisorinolu/GenericMysqlBackupApp/blob/master/sample_images/gba1.png?raw=true" width="600px" />


##### Features

- Completely written in **JavaFX**.
- **This is a basic app born out of the need to have backup of one's database periodically**
- **Simple** Easy Navigation and Simple to use.

---

## Reason Behind Its Creation

I deployed a Hospital Record Management System and it was working perfectly until the system crashed due to unforeseen circumstance.
When I returned to help fix it, I couldnt bear the agony of the receptionist talking about how much records she had lost because of the crash.
That's when the thought of this Basic App Idea popped up.

Why not create an app that will allow her to backup the database as a sql file into a external storage or the likes??

## ScreenShots

##### Login Screen

The Login Credentials:

- **Username** admin (case insensitive).
- **Password** admin (case insensitive).

<img src="https://github.com/babafemisorinolu/GenericMysqlBackupApp/blob/master/sample_images/gba1.png?raw=true" width="600px" />

##### Dashboard Screen

<img src="https://github.com/babafemisorinolu/GenericMysqlBackupApp/blob/master/sample_images/gba2.png?raw=true" width="600px" />

The Application allows you to connect to the `localhost` and export any of the MySQL database .
**CLICKing the `Load Database` button** will fetch the database list(by calling the "SHOW DATABASE" MYSQL command) and populate it into the combobox below.

**Clicking the `Create Backup` button** will open a save file dialog and allow you to choose the save path and export the database file successfully.

##### Settings Screen

<img src="https://github.com/babafemisorinolu/GenericMysqlBackupApp/blob/master/sample_images/gba3.png?raw=true" width="600px" />

The Application allows you to connect to the `localhost` and export any of the MySQL database .
The MysqlDump Path should be specified and the username and password for the database.

<img src="https://github.com/babafemisorinolu/GenericMysqlBackupApp/blob/master/sample_images/gba4.png?raw=true" width="600px" />

