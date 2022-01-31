# piano_game

This is a tool for musical ear training. I've been playing musical instruments for years and 
I've always had to ask someone to play me a random note, so I could test myself and find it. 
People are not that willing to play random notes to me whenever I want, so I decided to make 
this tool. This is my first independent project and it was made using Java Swing library, because 
it's the first thing I found when looking for info on how to create what I want. From what I 
understand this library is quite old and not really used nowadays.

This is what you'll see after running the project in IntelliJ IDEA or another IDE: 
- A window with piano keyboard and a Play button opens. 
- When you press the Play button, a random note is played back and printed in console ("The 
correct answer is ...") 
- Now you have to find the corresponding note on the keyboard. Each time you press a key, it's 
name is printed in the console. 
 
The app is already usable as it is, you just need to resist the temptation to look at 
the console before you've found what you think is the corresponding note. 

Tip: When you've found the right note, make sure it's the last played, so you'd know which one
was it when looking at the console (I like to press the key 3 times to make sure I'll know which
one I have conisdered to be the right one when looking at the console). Now you have to scroll 
back and see which actually was the correct note (e.g. "The correct answer is Do", it was printed 
when the "Play" button was pressed).

Warning: Play button plays back a different sound each time it's being pressed, therefore you can't 
check again what was the sound being played. 

Future improvements:
- displaying if answer was correct or not in the app screen not console
- menu 
- checkboxes for submitting the answer (in process)
- scoreboard
- game mode where you can collect points for correct answers 
- game mode with a timer that limits your time for finding the corresponding sound 
- game mode where points are calculated by how many times the user needed to press
keys to find the right note
- displaying accumulated points while playing 
- different color palettes to choose from
- instead of one also two or three octaves could be used 
- learn chords starting with simple major and minor chords
- find chords by ear like in the note game. Asking the user to play three notes at 
a time would be too much to ask, so instead by pressing the root note the whole 
chord would be played back and displayed (by darkening corresponding keys)
- different key sounds to choose from

