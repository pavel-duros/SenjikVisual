package com.example.client;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;

public class CarScreen extends Screen {
	public CarScreen() {
		super(Component.literal("Car Menu"));
	}

	@Override
	protected void init() {
		this.addRenderableWidget(Button.builder(Component.literal("Spawn"), button -> {
			Minecraft.getInstance().player.displayClientMessage(
					Component.literal("Car spawned (placeholder)"), false);
			this.onClose();
		}).bounds(this.width / 2 - 50, this.height / 2 - 10, 100, 20).build());
	}
}
