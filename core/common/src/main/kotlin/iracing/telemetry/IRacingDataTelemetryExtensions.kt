package iracing.telemetry

import iracing.IRacingData
import java.util.EnumSet

val IRacingData.Telemetry.dpWindshieldTearoff: Float
    get() = this.data["dpWindshieldTearoff"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.dpRRTireColdPress: Float
    get() = this.data["dpRRTireColdPress"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.dpRRTireChange: Float
    get() = this.data["dpRRTireChange"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.dpRFTireColdPress: Float
    get() = this.data["dpRFTireColdPress"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.dpRFTireChange: Float
    get() = this.data["dpRFTireChange"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.dpLRTireColdPress: Float
    get() = this.data["dpLRTireColdPress"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.dpLRTireChange: Float
    get() = this.data["dpLRTireChange"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.dpLFTireColdPress: Float
    get() = this.data["dpLFTireColdPress"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.dpLFTireChange: Float
    get() = this.data["dpLFTireChange"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.dpFuelFill: Float
    get() = this.data["dpFuelFill"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.dpFuelAddKg: Float
    get() = this.data["dpFuelAddKg"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.dpFastRepair: Float
    get() = this.data["dpFastRepair"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.dcStarter: Boolean
    get() = this.data["dcStarter"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.dcPitSpeedLimiterToggle: Boolean
    get() = this.data["dcPitSpeedLimiterToggle"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.YawRate_ST: Float
    get() = this.data["YawRate_ST"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.YawRate: Float
    get() = this.data["YawRate"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.YawNorth: Float
    get() = this.data["YawNorth"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.Yaw: Float
    get() = this.data["Yaw"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.WindVel: Float
    get() = this.data["WindVel"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.WindDir: Float
    get() = this.data["WindDir"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.WeatherType: Float
    get() = this.data["WeatherType"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.WaterTemp: Float
    get() = this.data["WaterTemp"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.WaterLevel: Float
    get() = this.data["WaterLevel"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.Voltage: Float
    get() = this.data["Voltage"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.VidCapEnabled: Boolean
    get() = this.data["VidCapEnabled"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.VidCapActive: Boolean
    get() = this.data["VidCapActive"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.VertAccel_ST: Float
    get() = this.data["VertAccel_ST"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.VertAccel: Float
    get() = this.data["VertAccel"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.VelocityZ_ST: Float
    get() = this.data["VelocityZ_ST"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.VelocityZ: Float
    get() = this.data["VelocityZ"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.VelocityY_ST: Float
    get() = this.data["VelocityY_ST"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.VelocityY: Float
    get() = this.data["VelocityY"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.VelocityX_ST: Float
    get() = this.data["VelocityX_ST"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.VelocityX: Float
    get() = this.data["VelocityX"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.TrackTempCrew: Float
    get() = this.data["TrackTempCrew"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.TrackTemp: Float
    get() = this.data["TrackTemp"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.TireSetsUsed: Float
    get() = this.data["TireSetsUsed"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.TireSetsAvailable: Float
    get() = this.data["TireSetsAvailable"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.TireRR_RumblePitch: Float
    get() = this.data["TireRR_RumblePitch"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.TireRF_RumblePitch: Float
    get() = this.data["TireRF_RumblePitch"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.TireLR_RumblePitch: Float
    get() = this.data["TireLR_RumblePitch"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.TireLF_RumblePitch: Float
    get() = this.data["TireLF_RumblePitch"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.ThrottleRaw: Float
    get() = this.data["ThrottleRaw"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.Throttle: Float
    get() = this.data["Throttle"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.SteeringWheelUseLinear: Boolean
    get() = this.data["SteeringWheelUseLinear"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.SteeringWheelTorque_ST: Float
    get() = this.data["SteeringWheelTorque_ST"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.SteeringWheelTorque: Float
    get() = this.data["SteeringWheelTorque"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.SteeringWheelPeakForceNm: Float
    get() = this.data["SteeringWheelPeakForceNm"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.SteeringWheelPctTorqueSignStops: Float
    get() = this.data["SteeringWheelPctTorqueSignStops"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.SteeringWheelPctTorqueSign: Float
    get() = this.data["SteeringWheelPctTorqueSign"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.SteeringWheelPctTorque: Float
    get() = this.data["SteeringWheelPctTorque"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.SteeringWheelPctSmoothing: Float
    get() = this.data["SteeringWheelPctSmoothing"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.SteeringWheelPctDamper: Float
    get() = this.data["SteeringWheelPctDamper"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.SteeringWheelMaxForceNm: Float
    get() = this.data["SteeringWheelMaxForceNm"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.SteeringWheelLimiter: Float
    get() = this.data["SteeringWheelLimiter"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.SteeringWheelAngleMax: Float
    get() = this.data["SteeringWheelAngleMax"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.SteeringWheelAngle: Float
    get() = this.data["SteeringWheelAngle"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.Speed: Float
    get() = this.data["Speed"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.SolarAzimuth: Float
    get() = this.data["SolarAzimuth"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.SolarAltitude: Float
    get() = this.data["SolarAltitude"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.Skies: Float
    get() = this.data["Skies"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.ShiftPowerPct: Float
    get() = this.data["ShiftPowerPct"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.ShiftIndicatorPct: Float
    get() = this.data["ShiftIndicatorPct"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.ShiftGrindRPM: Float
    get() = this.data["ShiftGrindRPM"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.SessionUniqueID: Float
    get() = this.data["SessionUniqueID"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.SessionTimeTotal: Float
    get() = this.data["SessionTimeTotal"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.SessionTimeRemain: Float
    get() = this.data["SessionTimeRemain"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.SessionTimeOfDay: Float
    get() = this.data["SessionTimeOfDay"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.SessionTime: Float
    get() = this.data["SessionTime"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.SessionTick: Float
    get() = this.data["SessionTick"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.SessionOnJokerLap: Boolean
    get() = this.data["SessionOnJokerLap"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.SessionNum: Float
    get() = this.data["SessionNum"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.SessionLapsTotal: Float
    get() = this.data["SessionLapsTotal"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.SessionLapsRemainEx: Float
    get() = this.data["SessionLapsRemainEx"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.SessionLapsRemain: Float
    get() = this.data["SessionLapsRemain"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.SessionJokerLapsRemain: Float
    get() = this.data["SessionJokerLapsRemain"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RollRate_ST: Float
    get() = this.data["RollRate_ST"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RollRate: Float
    get() = this.data["RollRate"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.Roll: Float
    get() = this.data["Roll"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RightTireSetsUsed: Float
    get() = this.data["RightTireSetsUsed"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RightTireSetsAvailable: Float
    get() = this.data["RightTireSetsAvailable"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.ReplaySessionTime: Float
    get() = this.data["ReplaySessionTime"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.ReplaySessionNum: Float
    get() = this.data["ReplaySessionNum"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.ReplayPlaySpeed: Float
    get() = this.data["ReplayPlaySpeed"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.ReplayPlaySlowMotion: Boolean
    get() = this.data["ReplayPlaySlowMotion"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.ReplayFrameNumEnd: Float
    get() = this.data["ReplayFrameNumEnd"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.ReplayFrameNum: Float
    get() = this.data["ReplayFrameNum"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RelativeHumidity: Float
    get() = this.data["RelativeHumidity"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RearTireSetsUsed: Float
    get() = this.data["RearTireSetsUsed"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RearTireSetsAvailable: Float
    get() = this.data["RearTireSetsAvailable"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RadioTransmitRadioIdx: Float
    get() = this.data["RadioTransmitRadioIdx"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RadioTransmitFrequencyIdx: Float
    get() = this.data["RadioTransmitFrequencyIdx"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RadioTransmitCarIdx: Float
    get() = this.data["RadioTransmitCarIdx"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RaceLaps: Float
    get() = this.data["RaceLaps"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RRwearR: Float
    get() = this.data["RRwearR"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RRwearM: Float
    get() = this.data["RRwearM"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RRwearL: Float
    get() = this.data["RRwearL"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RRtempCR: Float
    get() = this.data["RRtempCR"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RRtempCM: Float
    get() = this.data["RRtempCM"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RRtempCL: Float
    get() = this.data["RRtempCL"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RRshockVel_ST: Float
    get() = this.data["RRshockVel_ST"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RRshockVel: Float
    get() = this.data["RRshockVel"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RRshockDefl_ST: Float
    get() = this.data["RRshockDefl_ST"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RRshockDefl: Float
    get() = this.data["RRshockDefl"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RRcoldPressure: Float
    get() = this.data["RRcoldPressure"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RRbrakeLinePress: Float
    get() = this.data["RRbrakeLinePress"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RRTiresUsed: Float
    get() = this.data["RRTiresUsed"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RRTiresAvailable: Float
    get() = this.data["RRTiresAvailable"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RPM: Float
    get() = this.data["RPM"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RFwearR: Float
    get() = this.data["RFwearR"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RFwearM: Float
    get() = this.data["RFwearM"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RFwearL: Float
    get() = this.data["RFwearL"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RFtempCR: Float
    get() = this.data["RFtempCR"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RFtempCM: Float
    get() = this.data["RFtempCM"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RFtempCL: Float
    get() = this.data["RFtempCL"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RFshockVel_ST: Float
    get() = this.data["RFshockVel_ST"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RFshockVel: Float
    get() = this.data["RFshockVel"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RFshockDefl_ST: Float
    get() = this.data["RFshockDefl_ST"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RFshockDefl: Float
    get() = this.data["RFshockDefl"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RFcoldPressure: Float
    get() = this.data["RFcoldPressure"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RFbrakeLinePress: Float
    get() = this.data["RFbrakeLinePress"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RFTiresUsed: Float
    get() = this.data["RFTiresUsed"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.RFTiresAvailable: Float
    get() = this.data["RFTiresAvailable"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.PushToTalk: Boolean
    get() = this.data["PushToTalk"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.PushToPass: Boolean
    get() = this.data["PushToPass"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.PlayerTireCompound: Float
    get() = this.data["PlayerTireCompound"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.PlayerFastRepairsUsed: Float
    get() = this.data["PlayerFastRepairsUsed"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.PlayerCarWeightPenalty: Float
    get() = this.data["PlayerCarWeightPenalty"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.PlayerCarTowTime: Float
    get() = this.data["PlayerCarTowTime"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.PlayerCarTeamIncidentCount: Float
    get() = this.data["PlayerCarTeamIncidentCount"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.PlayerCarPowerAdjust: Float
    get() = this.data["PlayerCarPowerAdjust"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.PlayerCarPosition: Float
    get() = this.data["PlayerCarPosition"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.PlayerCarMyIncidentCount: Float
    get() = this.data["PlayerCarMyIncidentCount"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.PlayerCarInPitStall: Boolean
    get() = this.data["PlayerCarInPitStall"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.PlayerCarIdx: Float
    get() = this.data["PlayerCarIdx"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.PlayerCarDryTireSetLimit: Float
    get() = this.data["PlayerCarDryTireSetLimit"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.PlayerCarDriverIncidentCount: Float
    get() = this.data["PlayerCarDriverIncidentCount"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.PlayerCarClassPosition: Float
    get() = this.data["PlayerCarClassPosition"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.PlayerCarClass: Float
    get() = this.data["PlayerCarClass"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.PitstopActive: Boolean
    get() = this.data["PitstopActive"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.PitsOpen: Boolean
    get() = this.data["PitsOpen"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.PitchRate_ST: Float
    get() = this.data["PitchRate_ST"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.PitchRate: Float
    get() = this.data["PitchRate"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.Pitch: Float
    get() = this.data["Pitch"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.PitSvTireCompound: Float
    get() = this.data["PitSvTireCompound"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.PitSvRRP: Float
    get() = this.data["PitSvRRP"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.PitSvRFP: Float
    get() = this.data["PitSvRFP"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.PitSvLRP: Float
    get() = this.data["PitSvLRP"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.PitSvLFP: Float
    get() = this.data["PitSvLFP"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.PitSvFuel: Float
    get() = this.data["PitSvFuel"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.PitRepairLeft: Float
    get() = this.data["PitRepairLeft"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.PitOptRepairLeft: Float
    get() = this.data["PitOptRepairLeft"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.OnPitRoad: Boolean
    get() = this.data["OnPitRoad"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.OkToReloadTextures: Boolean
    get() = this.data["OkToReloadTextures"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.OilTemp: Float
    get() = this.data["OilTemp"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.OilPress: Float
    get() = this.data["OilPress"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.OilLevel: Float
    get() = this.data["OilLevel"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.MemSoftPageFaultSec: Float
    get() = this.data["MemSoftPageFaultSec"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.MemPageFaultSec: Float
    get() = this.data["MemPageFaultSec"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.ManualNoBoost: Boolean
    get() = this.data["ManualNoBoost"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.ManualBoost: Boolean
    get() = this.data["ManualBoost"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.ManifoldPress: Float
    get() = this.data["ManifoldPress"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LongAccel_ST: Float
    get() = this.data["LongAccel_ST"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LongAccel: Float
    get() = this.data["LongAccel"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LoadNumTextures: Boolean
    get() = this.data["LoadNumTextures"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.LeftTireSetsUsed: Float
    get() = this.data["LeftTireSetsUsed"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LeftTireSetsAvailable: Float
    get() = this.data["LeftTireSetsAvailable"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LatAccel_ST: Float
    get() = this.data["LatAccel_ST"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LatAccel: Float
    get() = this.data["LatAccel"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LapLastNLapTime: Float
    get() = this.data["LapLastNLapTime"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LapLastLapTime: Float
    get() = this.data["LapLastLapTime"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LapLasNLapSeq: Float
    get() = this.data["LapLasNLapSeq"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LapDistPct: Float
    get() = this.data["LapDistPct"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LapDist: Float
    get() = this.data["LapDist"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LapDeltaToSessionOptimalLap_OK: Boolean
    get() = this.data["LapDeltaToSessionOptimalLap_OK"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.LapDeltaToSessionOptimalLap_DD: Float
    get() = this.data["LapDeltaToSessionOptimalLap_DD"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LapDeltaToSessionOptimalLap: Float
    get() = this.data["LapDeltaToSessionOptimalLap"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LapDeltaToSessionLastlLap_OK: Boolean
    get() = this.data["LapDeltaToSessionLastlLap_OK"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.LapDeltaToSessionLastlLap_DD: Float
    get() = this.data["LapDeltaToSessionLastlLap_DD"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LapDeltaToSessionLastlLap: Float
    get() = this.data["LapDeltaToSessionLastlLap"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LapDeltaToSessionBestLap_OK: Boolean
    get() = this.data["LapDeltaToSessionBestLap_OK"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.LapDeltaToSessionBestLap_DD: Float
    get() = this.data["LapDeltaToSessionBestLap_DD"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LapDeltaToSessionBestLap: Float
    get() = this.data["LapDeltaToSessionBestLap"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LapDeltaToOptimalLap_OK: Boolean
    get() = this.data["LapDeltaToOptimalLap_OK"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.LapDeltaToOptimalLap_DD: Float
    get() = this.data["LapDeltaToOptimalLap_DD"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LapDeltaToOptimalLap: Float
    get() = this.data["LapDeltaToOptimalLap"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LapDeltaToBestLap_OK: Boolean
    get() = this.data["LapDeltaToBestLap_OK"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.LapDeltaToBestLap_DD: Float
    get() = this.data["LapDeltaToBestLap_DD"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LapDeltaToBestLap: Float
    get() = this.data["LapDeltaToBestLap"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LapCurrentLapTime: Float
    get() = this.data["LapCurrentLapTime"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LapCompleted: Float
    get() = this.data["LapCompleted"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LapBestNLapTime: Float
    get() = this.data["LapBestNLapTime"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LapBestNLapLap: Float
    get() = this.data["LapBestNLapLap"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LapBestLapTime: Float
    get() = this.data["LapBestLapTime"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LapBestLap: Float
    get() = this.data["LapBestLap"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.Lap: Float
    get() = this.data["Lap"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LRwearR: Float
    get() = this.data["LRwearR"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LRwearM: Float
    get() = this.data["LRwearM"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LRwearL: Float
    get() = this.data["LRwearL"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LRtempCR: Float
    get() = this.data["LRtempCR"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LRtempCM: Float
    get() = this.data["LRtempCM"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LRtempCL: Float
    get() = this.data["LRtempCL"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LRshockVel_ST: Float
    get() = this.data["LRshockVel_ST"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LRshockVel: Float
    get() = this.data["LRshockVel"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LRshockDefl_ST: Float
    get() = this.data["LRshockDefl_ST"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LRshockDefl: Float
    get() = this.data["LRshockDefl"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LRcoldPressure: Float
    get() = this.data["LRcoldPressure"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LRbrakeLinePress: Float
    get() = this.data["LRbrakeLinePress"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LRTiresUsed: Float
    get() = this.data["LRTiresUsed"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LRTiresAvailable: Float
    get() = this.data["LRTiresAvailable"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LFwearR: Float
    get() = this.data["LFwearR"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LFwearM: Float
    get() = this.data["LFwearM"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LFwearL: Float
    get() = this.data["LFwearL"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LFtempCR: Float
    get() = this.data["LFtempCR"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LFtempCM: Float
    get() = this.data["LFtempCM"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LFtempCL: Float
    get() = this.data["LFtempCL"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LFshockVel_ST: Float
    get() = this.data["LFshockVel_ST"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LFshockVel: Float
    get() = this.data["LFshockVel"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LFshockDefl_ST: Float
    get() = this.data["LFshockDefl_ST"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LFshockDefl: Float
    get() = this.data["LFshockDefl"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LFcoldPressure: Float
    get() = this.data["LFcoldPressure"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LFbrakeLinePress: Float
    get() = this.data["LFbrakeLinePress"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LFTiresUsed: Float
    get() = this.data["LFTiresUsed"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.LFTiresAvailable: Float
    get() = this.data["LFTiresAvailable"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.IsReplayPlaying: Boolean
    get() = this.data["IsReplayPlaying"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.IsOnTrackCar: Boolean
    get() = this.data["IsOnTrackCar"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.IsOnTrack: Boolean
    get() = this.data["IsOnTrack"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.IsInGarage: Boolean
    get() = this.data["IsInGarage"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.IsGarageVisible: Boolean
    get() = this.data["IsGarageVisible"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.IsDiskLoggingEnabled: Boolean
    get() = this.data["IsDiskLoggingEnabled"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.IsDiskLoggingActive: Boolean
    get() = this.data["IsDiskLoggingActive"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.HandbrakeRaw: Float
    get() = this.data["HandbrakeRaw"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.GpuUsage: Float
    get() = this.data["GpuUsage"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.Gear: Float
    get() = this.data["Gear"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.FuelUsePerHour: Float
    get() = this.data["FuelUsePerHour"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.FuelPress: Float
    get() = this.data["FuelPress"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.FuelLevelPct: Float
    get() = this.data["FuelLevelPct"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.FuelLevel: Float
    get() = this.data["FuelLevel"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.FrontTireSetsUsed: Float
    get() = this.data["FrontTireSetsUsed"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.FrontTireSetsAvailable: Float
    get() = this.data["FrontTireSetsAvailable"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.FrameRate: Float
    get() = this.data["FrameRate"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.FogLevel: Float
    get() = this.data["FogLevel"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.FastRepairUsed: Float
    get() = this.data["FastRepairUsed"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.FastRepairAvailable: Float
    get() = this.data["FastRepairAvailable"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.EnterExitReset: Float
    get() = this.data["EnterExitReset"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.Engine0_RPM: Float
    get() = this.data["Engine0_RPM"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.DriverMarker: Boolean
    get() = this.data["DriverMarker"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.DisplayUnits: Float
    get() = this.data["DisplayUnits"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.DCLapStatus: Float
    get() = this.data["DCLapStatus"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.DCDriversSoFar: Float
    get() = this.data["DCDriversSoFar"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CpuUsageFG: Float
    get() = this.data["CpuUsageFG"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CpuUsageBG: Float
    get() = this.data["CpuUsageBG"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.ClutchRaw: Float
    get() = this.data["ClutchRaw"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.Clutch: Float
    get() = this.data["Clutch"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.ChanQuality: Float
    get() = this.data["ChanQuality"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.ChanPartnerQuality: Float
    get() = this.data["ChanPartnerQuality"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.ChanLatency: Float
    get() = this.data["ChanLatency"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.ChanClockSkew: Float
    get() = this.data["ChanClockSkew"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.ChanAvgLatency: Float
    get() = this.data["ChanAvgLatency"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CarIdxTireCompound: Float
    get() = this.data["CarIdxTireCompound"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CarIdxSteer: Float
    get() = this.data["CarIdxSteer"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CarIdxRPM: Float
    get() = this.data["CarIdxRPM"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CarIdxQualTireCompoundLocked: Boolean
    get() = this.data["CarIdxQualTireCompoundLocked"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.CarIdxQualTireCompound: Float
    get() = this.data["CarIdxQualTireCompound"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CarIdxPosition: Float
    get() = this.data["CarIdxPosition"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CarIdxPaceRow: Float
    get() = this.data["CarIdxPaceRow"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CarIdxPaceLine: Float
    get() = this.data["CarIdxPaceLine"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CarIdxP2P_Status: Boolean
    get() = this.data["CarIdxP2P_Status"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.CarIdxP2P_Count: Float
    get() = this.data["CarIdxP2P_Count"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CarIdxOnPitRoad: Boolean
    get() = this.data["CarIdxOnPitRoad"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.CarIdxLastLapTime: Float
    get() = this.data["CarIdxLastLapTime"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CarIdxLapDistPct: Float
    get() = this.data["CarIdxLapDistPct"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CarIdxLapCompleted: Float
    get() = this.data["CarIdxLapCompleted"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CarIdxLap: Float
    get() = this.data["CarIdxLap"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CarIdxGear: Float
    get() = this.data["CarIdxGear"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CarIdxFastRepairsUsed: Float
    get() = this.data["CarIdxFastRepairsUsed"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CarIdxF2Time: Float
    get() = this.data["CarIdxF2Time"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CarIdxEstTime: Float
    get() = this.data["CarIdxEstTime"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CarIdxClassPosition: Float
    get() = this.data["CarIdxClassPosition"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CarIdxClass: Float
    get() = this.data["CarIdxClass"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CarIdxBestLapTime: Float
    get() = this.data["CarIdxBestLapTime"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CarIdxBestLapNum: Float
    get() = this.data["CarIdxBestLapNum"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CamGroupNumber: Float
    get() = this.data["CamGroupNumber"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CamCarIdx: Float
    get() = this.data["CamCarIdx"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CamCameraNumber: Float
    get() = this.data["CamCameraNumber"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.BrakeRaw: Float
    get() = this.data["BrakeRaw"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.BrakeABSactive: Boolean
    get() = this.data["BrakeABSactive"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.Brake: Float
    get() = this.data["Brake"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.AirTemp: Float
    get() = this.data["AirTemp"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.AirPressure: Float
    get() = this.data["AirPressure"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.AirDensity: Float
    get() = this.data["AirDensity"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.dpFuelAutoFillEnabled: Float
    get() = this.data["dpFuelAutoFillEnabled"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.dpFuelAutoFillActive: Float
    get() = this.data["dpFuelAutoFillActive"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.dcTriggerWindshieldWipers: Boolean
    get() = this.data["dcTriggerWindshieldWipers"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.dcToggleWindshieldWipers: Boolean
    get() = this.data["dcToggleWindshieldWipers"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.dcLowFuelAccept: Boolean
    get() = this.data["dcLowFuelAccept"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.dcHeadlightFlash: Boolean
    get() = this.data["dcHeadlightFlash"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.dcDashPage: Float
    get() = this.data["dcDashPage"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.dcBrakeBias: Float
    get() = this.data["dcBrakeBias"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.WeatherDeclaredWet: Boolean
    get() = this.data["WeatherDeclaredWet"]?.unit?.toBooleanStrictOrNull() ?: false

val IRacingData.Telemetry.SteeringWheelPctIntensity: Float
    get() = this.data["SteeringWheelPctIntensity"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.Precipitation: Float
    get() = this.data["Precipitation"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.PlayerCarSLShiftRPM: Float
    get() = this.data["PlayerCarSLShiftRPM"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.PlayerCarSLLastRPM: Float
    get() = this.data["PlayerCarSLLastRPM"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.PlayerCarSLFirstRPM: Float
    get() = this.data["PlayerCarSLFirstRPM"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.PlayerCarSLBlinkRPM: Float
    get() = this.data["PlayerCarSLBlinkRPM"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CarDistBehind: Float
    get() = this.data["CarDistBehind"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CarDistAhead: Float
    get() = this.data["CarDistAhead"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CamCameraState: EnumSet<CameraStateFlags>
    get() = CameraStateFlags.fromValue(this.data["CamCameraState"]?.unit?.toIntOrNull() ?: 0)

val IRacingData.Telemetry.CarIdxPaceFlags: EnumSet<PaceFlags>
    get() = PaceFlags.fromValue(this.data["CarIdxPaceFlags"]?.unit?.toIntOrNull() ?: 0)

val IRacingData.Telemetry.PitSvFlags: EnumSet<GamePitSvFlags>
    get() = GamePitSvFlags.fromValue(this.data["PitSvFlags"]?.unit?.toIntOrNull() ?: 0)

val IRacingData.Telemetry.SessionFlags: EnumSet<GameSessionFlags>
    get() = GameSessionFlags.fromValue(this.data["SessionFlags"]?.unit?.toULongOrNull() ?: 0u)

val IRacingData.Telemetry.EngineWarnings: EnumSet<EngineWarningsFlags>
    get() = EngineWarningsFlags.fromValue(this.data["EngineWarnings"]?.unit?.toIntOrNull() ?: 0)

val IRacingData.Telemetry.TrackWetness: Int
    get() = this.data["TrackWetness"]?.unit?.toIntOrNull() ?: 0

val IRacingData.Telemetry.PaceMode: Int
    get() = this.data["PaceMode"]?.unit?.toIntOrNull() ?: 0

val IRacingData.Telemetry.PlayerCarPitSvStatus: Int
    get() = this.data["PlayerCarPitSvStatus"]?.unit?.toIntOrNull() ?: 0

val IRacingData.Telemetry.PlayerTrackSurfaceMaterial: Int
    get() = this.data["PlayerTrackSurfaceMaterial"]?.unit?.toIntOrNull() ?: 0

val IRacingData.Telemetry.PlayerTrackSurface: TrackLocation
    get() = TrackLocation.fromValue(this.data["PlayerTrackSurface"]?.unit?.toIntOrNull() ?: 0)

val IRacingData.Telemetry.SessionState: GameSessionState
    get() = GameSessionState.fromValue(this.data["SessionState"]?.unit?.toIntOrNull() ?: 0)

val IRacingData.Telemetry.CarLeftRight: CarRadar
    get() = CarRadar.fromValue(this.data["CarLeftRight"]?.unit?.toIntOrNull() ?: 0)

val IRacingData.Telemetry.CarIdxTrackSurfaceMaterial: Int
    get() = this.data["CarIdxTrackSurfaceMaterial"]?.unit?.toIntOrNull() ?: 0

val IRacingData.Telemetry.CarIdxTrackSurface: TrackLocation
    get() = TrackLocation.fromValue(this.data["CarIdxTrackSurface"]?.unit?.toIntOrNull() ?: 0)

val IRacingData.Telemetry.CarIdxSessionFlags: Int
    get() = this.data["CarIdxSessionFlags"]?.unit?.toIntOrNull() ?: 0