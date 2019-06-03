/*
 * Copyright (c) 2019, ganom <https://github.com/Ganom>
 * Copyright (c) 2019, Owain van Brakel <owain.vanbrakel@gmail.com>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.plugins.flexoredchins;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.Keybind;
import net.runelite.client.config.Stub;

@ConfigGroup("RedChinsFlexo")
public interface RedChinsFlexoConfig
	extends Config
{

	@ConfigItem(
		keyName = "hotkeyToggleRedChins",
		name = "Toggle automation",
		description = "Toggle flexo mouse control",
		position = 0
	)
	default Keybind hotkeyToggleRedChins()
	{
		return Keybind.NOT_SET;
	}

	@ConfigItem(
		keyName = "delayStub",
		name = "Delay",
		description = "",
		position = 1
	)
	default Stub delayStub() { return new Stub(); }

	@ConfigItem(
		keyName = "randLow",
		name = "Minimum MS",
		description = "Dont be greedy",
		position = 2,
		parent = "delayStub"
	)
	default int randLowRedChins()
	{
		return 300;
	}

	@ConfigItem(
		keyName = "randLower",
		name = "Maximum MS",
		description = "Dont be greedy",
		position = 3,
		parent = "delayStub"
	)
	default int randHighRedChins()
	{
		return 400;
	}

	@ConfigItem(
		keyName = "overlayStub",
		name = "Overlay",
		description = "",
		position = 4
	)
	default Stub overlayStub() { return new Stub(); }

	@ConfigItem(
		keyName = "redChinOverlay",
		name = "Outline red chins",
		description = "Outlines red chinchompas with the color magenta",
		position = 5,
		parent = "overlayStub"
	)
	default boolean redChinOverlay()
	{
		return true;
	}

	@ConfigItem(
		keyName = "tileOverlayStub",
		name = "Tile overlay",
		description = "",
		position = 6,
		parent = "overlayStub"
	)
	default Stub tileOverlayStub() { return new Stub(); }

	@ConfigItem(
		keyName = "trapTileOverlay",
		name = "Outline trap locations",
		description = "Outlines the location where traps are being set",
		position = 7,
		parent = "tileOverlayStub"
	)
	default boolean trapTileOverlay()
	{
		return true;
	}

	@ConfigItem(
		keyName = "trapTileOverlayColors",
		name = "Outline status colors",
		description = "Use colors for the trap outline",
		position = 8,
		parent = "tileOverlayStub",
		hidden = true,
		unhide = "trapTileOverlay"
	)
	default boolean trapTileOverlayColors()
	{
		return true;
	}

	@ConfigItem(
		keyName = "trapTileOverlayNumbers",
		name = "Show trap numbers",
		description = "Show numbers in the trap overlay",
		position = 9,
		parent = "tileOverlayStub",
		hidden = true,
		unhide = "trapTileOverlay"
	)
	default boolean trapTileOverlayNumbers()
	{
		return true;
	}
}

