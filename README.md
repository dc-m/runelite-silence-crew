# Silence Crew!

A RuneLite plugin that filters crewmate messages while sailing in Old School RuneScape. Keep the important notifications (like cargo full), mute the endless chatter.

## Features

- **Filter crewmate overhead text and chat messages** - No more spam from chatty sailors
- **Always see "Cargo Full" messages** - Never miss when your hold is at capacity
- **Separate controls for your crew vs. others' crew** - Fine-tune what you want to see
- **Per-message-type filtering** - Toggle each category independently

## Configuration Options

### Important Messages

| Option | Description | Default |
|--------|-------------|---------|
| Always Show Cargo Full | Cargo full messages are never filtered | ON |

### Your Crew

Filter messages from your own crewmates:

| Option | Description | Default |
|--------|-------------|---------|
| Filter All (General) | Filter unrecognized messages from your crew | ON |
| Filter Idle Chatter | Filter ambient dialogue ("Life is easier on the sea", etc.) | ON |
| Filter Salvage Found | Filter "Managed to hook some salvage!" messages | ON |
| Filter Sailing Status | Filter sail trimming, wind catcher messages | ON |
| Filter Warnings | Filter resource warnings ("Can't find repair kits") | OFF |

### Others' Crew

Filter messages from other players' crewmates:

| Option | Description | Default |
|--------|-------------|---------|
| Filter All (General) | Filter unrecognized messages from others' crew | ON |
| Filter Idle Chatter | Filter ambient dialogue | ON |
| Filter Salvage Found | Filter salvage notifications | ON |
| Filter Sailing Status | Filter sailing operation messages | ON |
| Filter Warnings | Filter warning messages | ON |

## Supported Crewmates

The plugin recognizes dialogue from all sailing crewmates:

- Jobless Jim
- Ex-Captain Siad
- Adventurer Ada
- Cabin Boy Jenkins
- Oarswoman Olga
- Jittery Jim
- Bosun Zarah
- Jolly Jim
- Spotter Virginia
- Sailor Jakob

## Message Categories

**Cargo Full (Never filtered by default)**
- "The cargo hold is full. I can't salvage anything."

**Salvage Found**
- "Managed to hook some salvage! I'll put it in the cargo hold."
- "I've caught a wind mote!"
- "There's somethin' in the drink to the [direction]!"
- "I can see something to the [direction]!"

**Sailing Status**
- "Trimmed those sails good and proper, Captain!"
- "Enabling the wind catcher!"
- "Disabling the wind catcher!"

**Warnings**
- "I can't find any repair kits in the cargo hold."
- "I can't find any ammo in the cargo hold."

**Idle Chatter**
- Various ambient dialogue unique to each crewmate

## Installation

Search for "Silence Crew" in the RuneLite Plugin Hub.

## Feedback & Issues

If you encounter messages that aren't being filtered correctly, or have suggestions for improvements, please open an issue on GitHub.

## License

BSD 2-Clause License - see [LICENSE](LICENSE) for details.
