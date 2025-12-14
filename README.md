# NoMerge

Minecraft's default item merging is ugly. So I fixed it.

This is a tiny mod for **1.21.1+** that stops dropped items from slurping together into those weird, spinning clumps. If you drop 64 diamonds, you get 64 diamonds on the floor.

## 🤷 Why?
Because I like the aesthetic.
* **The Look:** Items actually pile up like physical objects.
* **The Vibe:** No more magical magnetic attraction between rocks.
* **The Chaos:** Seeing a true explosion of loot is satisfying.

## 🔧 How it Works
It's literally one Mixin.
I hook into `ItemEntity.mergeWithNeighbours()` and tell it to `return;` immediately. The game doesn't even *think* about merging. It saves the CPU from doing the math, then immediately spends that CPU on rendering 500 individual entities.

## 🧱 Build / Install
1.  Clone this.
2.  Run `./gradlew build`.
3.  Throw the jar in your mods folder.
4.  Profit.

## 💣 The "My PC is Burning" Warning
**Read this.**

Minecraft merges items for a reason: Performance.
If you use this mod and decide to blow up a double chest full of cobblestone, your framerate is going to leave the chat.

* **Don't** use this on a server with massive mob farms unless you like lag.
* **Don't** come crying to me if your quarry creates a black hole of entities.

You have been warned. Enjoy the pretty piles of loot.

## ⚖️ License
**CC0 1.0 Universal (Public Domain)**.

Because of the Mojang mappings (and because I don't care), this project is dedicated to the public domain. I reserve no rights. Take it, sell it, eat it—I don't mind.

[![CC0](https://licensebuttons.net/p/zero/1.0/88x31.png)](http://creativecommons.org/publicdomain/zero/1.0/)