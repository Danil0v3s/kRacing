package iracing.telemetry

enum class CarRadar(val value: Int) {
    LROff(0),
    LRClear(1),
    LRCarLeft(2),
    LRCarRight(3),
    LRCarLeftRight(4),
    LR2CarsLeft(5),
    LR2CarsRight(6);

    companion object {
        fun fromValue(value: Int): CarRadar {
            return values().find { it.value == value } ?: LROff
        }
    }
}

enum class GameSessionState(val value: Int) {
    StateInvalid(0),
    StateGetInCar(1),
    StateWarmup(2),
    StateParadeLaps(3),
    StateRacing(4),
    StateCheckered(5),
    StateCoolDown(6);

    companion object {
        fun fromValue(value: Int): GameSessionState {
            return values().find { it.value == value } ?: StateInvalid
        }
    }
}

enum class TrackLocation(val value: Int) {
    NotInWorld(-1),
    OffTrack(0),
    InPitStall(1),
    ApproachingPits(2),
    OnTrack(3);

    companion object {
        fun fromValue(value: Int): TrackLocation {
            return values().find { it.value == value } ?: NotInWorld
        }
    }
}