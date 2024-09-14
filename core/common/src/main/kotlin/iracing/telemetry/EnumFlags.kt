package iracing.telemetry

import java.util.*

enum class EngineWarningsFlags(val value: Int) {
    WaterTempWarning(0x0001),
    FuelPressureWarning(0x0002),
    OilPressureWarning(0x0004),
    EngineStalled(0x0008),
    PitSpeedLimiter(0x0010),
    RevLimiterActive(0x0020),
    OilTempWarning(0x0040);

    companion object {
        fun fromValue(value: Int): EnumSet<EngineWarningsFlags> {
            val result = EnumSet.noneOf(EngineWarningsFlags::class.java)
            for (warning in values()) {
                if ((value and warning.value) != 0) {
                    result.add(warning)
                }
            }
            return result
        }

        fun toValue(warnings: EnumSet<EngineWarningsFlags>): Int {
            var result = 0
            for (warning in warnings) {
                result = result or warning.value
            }
            return result
        }
    }
}

enum class GameSessionFlags(val value: ULong) {
    // global flags
    Checkered(0x00000001u),
    White(0x00000002u),
    Green(0x00000004u),
    Yellow(0x00000008u),
    Red(0x00000010u),
    Blue(0x00000020u),
    Debris(0x00000040u),
    Crossed(0x00000080u),
    YellowWaving(0x00000100u),
    OneLapToGreen(0x00000200u),
    GreenHeld(0x00000400u),
    TenToGo(0x00000800u),
    FiveToGo(0x00001000u),
    RandomWaving(0x00002000u),
    Caution(0x00004000u),
    CautionWaving(0x00008000u),

    // drivers black flags
    Black(0x00010000u),
    Disqualify(0x00020000u),
    Servicible(0x00040000u), // car is allowed service (not a flag)
    Furled(0x00080000u),
    Repair(0x00100000u),

    // start lights
    StartHidden(0x10000000u),
    StartReady(0x20000000u),
    StartSet(0x40000000u),
    StartGo(0x80000000u);

    companion object {
        fun fromValue(value: ULong): EnumSet<GameSessionFlags> {
            val result = EnumSet.noneOf(GameSessionFlags::class.java)
            for (flag in values()) {
                if ((value and flag.value) != 0UL) {
                    result.add(flag)
                }
            }
            return result
        }

        fun toValue(flags: EnumSet<GameSessionFlags>): ULong {
            var result: ULong = 0u
            for (flag in flags) {
                result = result or flag.value
            }
            return result
        }
    }
}

enum class CameraStateFlags(val value: Int) {
    IsSessionScreen(0x0001),            // the camera tool can only be activated if viewing the session screen (out of car)
    IsScenicActive(0x0002),             // the scenic camera is active (no focus car)

    // these can be changed with a broadcast message
    CamToolActive(0x0004),
    UIHidden(0x0008),
    UseAutoShotSelection(0x0010),
    UseTemporaryEdits(0x0020),
    UseKeyAcceleration(0x0040),
    UseKey10xAcceleration(0x0080),
    UseMouseAimMode(0x0100);

    companion object {
        fun fromValue(value: Int): EnumSet<CameraStateFlags> {
            val result = EnumSet.noneOf(CameraStateFlags::class.java)
            for (state in values()) {
                if ((value and state.value) != 0) {
                    result.add(state)
                }
            }
            return result
        }

        fun toValue(states: EnumSet<CameraStateFlags>): Int {
            var result = 0
            for (state in states) {
                result = result or state.value
            }
            return result
        }
    }
}

enum class GamePitSvFlags(val value: Int) {
    LFTireChange(0x0001),
    RFTireChange(0x0002),
    LRTireChange(0x0004),
    RRTireChange(0x0008),

    FuelFill(0x0010),
    WindshieldTearoff(0x0020),
    FastRepair(0x0040);

    companion object {
        fun fromValue(value: Int): EnumSet<GamePitSvFlags> {
            val result = EnumSet.noneOf(GamePitSvFlags::class.java)
            for (flag in values()) {
                if ((value and flag.value) != 0) {
                    result.add(flag)
                }
            }
            return result
        }

        fun toValue(flags: EnumSet<GamePitSvFlags>): Int {
            var result = 0
            for (flag in flags) {
                result = result or flag.value
            }
            return result
        }
    }
}

enum class PaceFlags(val value: Int) {
    PaceFlagsEndOfLine(0x0001),
    PaceFlagsFreePass(0x0002),
    PaceFlagsWavedAround(0x0004);

    companion object {
        fun fromValue(value: Int): EnumSet<PaceFlags> {
            val result = EnumSet.noneOf(PaceFlags::class.java)
            for (flag in values()) {
                if ((value and flag.value) != 0) {
                    result.add(flag)
                }
            }
            return result
        }

        fun toValue(flags: EnumSet<PaceFlags>): Int {
            var result = 0
            for (flag in flags) {
                result = result or flag.value
            }
            return result
        }
    }
}
