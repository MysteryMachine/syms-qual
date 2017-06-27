# Symmetra's Qualifying Matches

Work on a free Overwatch fan game!

All characters and Overwatch belong to Blizzard.

## Working with this (for collaborators)

Run it by opening Windows Powershell and then typing in

```
cd E:/Git/syms-qual
lein figwheel
```

Wait for it to run. A browser screen should pop up with the game running.

```
1. Open Sublime Text
2. Open the E:/Git/syms-qual folder
3. Navigate to src/syms-qual/data
```

To edit characters, go to `characters.cljs`.

To edit backgrounds, go to `bg.cljs`.

To edit levels, go to `scenes/your_level_name.cljs`.

Follow existing conventions, and be super careful with parentheses. Watch carefully
for errors to pop up in the game screen, it means you did something wrong.

To change the scene you're working on, go to `syms-qual/data.cljs`, and modify the
base state. Replace route-66 and diner with the appropriate things, being sure to keep
the colon behind them.