## Generic Mysql Backup App v1.0 : JavaFX

<img src="https://raw.githubusercontent.com/halilozercan/bettervideoplayer/master/screens/fullscreen.png" width="600px" />

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

<img src="https://raw.githubusercontent.com/halilozercan/bettervideoplayer/master/screens/fullscreen.png" width="600px" />

##### Dashboard Screen

The Application allows you to connect to the `localhost` and export any of the MySQL database .
**CLICKing the `Load Database` button** will fetch the database list(by calling the "SHOW DATABASE" MYSQL command) and populate it into the combobox below.

**Clicking the `Create Backup` button** will open a save file dialog and allow you to choose the save path and export the database file successfully.

##### Settings Screen

The Application allows you to connect to the `localhost` and export any of the MySQL database .
