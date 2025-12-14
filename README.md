# Item Merge Begone

Minecraft's item merging is ugly. So I fixed it.

This is a tiny mod for **1.21.1+** that stops dropped items from merging.

## 🤷 Why?
Because I like the aesthetic. The chaos. The visceral satisfaction of picking up a ton of items off the ground.

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
If you use this mod and decide to blow up 20 double chests full of cobblestone, your framerate is going to leave the chat.

* **Don't** use this on a server with massive mob farms unless you like lag.
* **Don't** come crying to me if your quarry creates a black hole of entities.

You have been warned. Enjoy the pretty piles of loot.

## ⚖️ License
**CC0 1.0 Universal (Public Domain)**.

Because of the Mojang mappings (and because I don't care), I have to use this license. I reserve no rights. Take it, sell it, eat it. Threaten your wife's boyfriend with it.

[![CC0](https://licensebuttons.net/p/zero/1.0/88x31.png)](http://creativecommons.org/publicdomain/zero/1.0/)
