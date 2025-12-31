/*
 * Copyright (c) 2025, David
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
 *
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
package com.silencecrew;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;

/**
 * Configuration interface for the Silence Crew! plugin.
 */
@ConfigGroup("silencecrew")
public interface SilenceCrewConfig extends Config
{
	// ==================== SECTIONS ====================

	@ConfigSection(
		name = "Your Crew",
		description = "Filter settings for your own crewmates",
		position = 0
	)
	String ownCrewSection = "ownCrew";

	@ConfigSection(
		name = "Others' Crew",
		description = "Filter settings for other players' crewmates",
		position = 1
	)
	String othersCrewSection = "othersCrew";

	@ConfigSection(
		name = "Important Messages",
		description = "Messages that should always be shown",
		position = 2
	)
	String importantSection = "important";

	@ConfigSection(
		name = "Advanced",
		description = "Advanced settings",
		position = 3
	)
	String advancedSection = "advanced";

	// ==================== IMPORTANT MESSAGES ====================

	@ConfigItem(
		keyName = "alwaysShowCargoFull",
		name = "Always Show Cargo Full",
		description = "<html>Never hide 'cargo full' messages so you know when to return to port.<br><br>" +
			"<b>Examples:</b><br>" +
			"• The cargo hold is full. I can't salvage anything.</html>",
		position = 0,
		section = importantSection
	)
	default boolean alwaysShowCargoFull()
	{
		return true;
	}

	// ==================== ADVANCED ====================

	@ConfigItem(
		keyName = "treatAmbiguousAsOwn",
		name = "Treat Unknown as Own Crew",
		description = "<html>When the plugin can't determine if a crewmate belongs to you or another player,<br>" +
			"this setting controls which filter rules apply.<br><br>" +
			"<b>ON:</b> Use 'Your Crew' settings<br>" +
			"<b>OFF:</b> Use 'Others' Crew' settings</html>",
		position = 0,
		section = advancedSection
	)
	default boolean treatAmbiguousAsOwn()
	{
		return true;
	}

	// ==================== YOUR CREW FILTERS ====================

	@ConfigItem(
		keyName = "filterOwnCrewGeneral",
		name = "Filter All (General)",
		description = "<html>Hide any crewmate message that doesn't fit other categories.<br>" +
			"Acts as a catch-all for unrecognized dialogue.</html>",
		position = 0,
		section = ownCrewSection
	)
	default boolean filterOwnCrewGeneral()
	{
		return true;
	}

	@ConfigItem(
		keyName = "filterOwnIdleChatter",
		name = "Filter Idle Chatter",
		description = "<html>Hide ambient/idle dialogue from your crewmates.<br><br>" +
			"<b>Examples:</b><br>" +
			"• Life is easier on the sea<br>" +
			"• I'm just happy to be here<br>" +
			"• C for miles. C for fish.</html>",
		position = 1,
		section = ownCrewSection
	)
	default boolean filterOwnIdleChatter()
	{
		return true;
	}

	@ConfigItem(
		keyName = "filterOwnSalvageFound",
		name = "Filter Salvage Found",
		description = "<html>Hide messages when your crew finds or collects salvage.<br><br>" +
			"<b>Examples:</b><br>" +
			"• Managed to hook some salvage!<br>" +
			"• I've caught a wind mote!<br>" +
			"• There's somethin' in the drink to the north!</html>",
		position = 2,
		section = ownCrewSection
	)
	default boolean filterOwnSalvageFound()
	{
		return true;
	}

	@ConfigItem(
		keyName = "filterOwnSailingStatus",
		name = "Filter Sailing Status",
		description = "<html>Hide sailing operation messages.<br><br>" +
			"<b>Examples:</b><br>" +
			"• Trimmed those sails good and proper, Captain!<br>" +
			"• Enabling the wind catcher!<br>" +
			"• Disabling the wind catcher!</html>",
		position = 3,
		section = ownCrewSection
	)
	default boolean filterOwnSailingStatus()
	{
		return true;
	}

	@ConfigItem(
		keyName = "filterOwnWarnings",
		name = "Filter Warnings",
		description = "<html>Hide warning messages about missing resources.<br>" +
			"<b>Default OFF</b> - these may be important!<br><br>" +
			"<b>Examples:</b><br>" +
			"• I can't find any repair kits in the cargo hold<br>" +
			"• I can't find any ammo in the cargo hold</html>",
		position = 4,
		section = ownCrewSection
	)
	default boolean filterOwnWarnings()
	{
		return false;
	}

	// ==================== OTHERS' CREW FILTERS ====================

	@ConfigItem(
		keyName = "filterOthersCrewGeneral",
		name = "Filter All (General)",
		description = "<html>Hide any message from other players' crewmates<br>" +
			"that doesn't fit other categories.</html>",
		position = 0,
		section = othersCrewSection
	)
	default boolean filterOthersCrewGeneral()
	{
		return true;
	}

	@ConfigItem(
		keyName = "filterOthersIdleChatter",
		name = "Filter Idle Chatter",
		description = "<html>Hide ambient/idle dialogue from other players' crewmates.</html>",
		position = 1,
		section = othersCrewSection
	)
	default boolean filterOthersIdleChatter()
	{
		return true;
	}

	@ConfigItem(
		keyName = "filterOthersSalvageFound",
		name = "Filter Salvage Found",
		description = "<html>Hide salvage notifications from other players' crewmates.</html>",
		position = 2,
		section = othersCrewSection
	)
	default boolean filterOthersSalvageFound()
	{
		return true;
	}

	@ConfigItem(
		keyName = "filterOthersSailingStatus",
		name = "Filter Sailing Status",
		description = "<html>Hide sailing operation messages from other players' crewmates.</html>",
		position = 3,
		section = othersCrewSection
	)
	default boolean filterOthersSailingStatus()
	{
		return true;
	}

	@ConfigItem(
		keyName = "filterOthersWarnings",
		name = "Filter Warnings",
		description = "<html>Hide warning messages from other players' crewmates.<br>" +
			"These are usually not relevant to you.</html>",
		position = 4,
		section = othersCrewSection
	)
	default boolean filterOthersWarnings()
	{
		return true;
	}
}
