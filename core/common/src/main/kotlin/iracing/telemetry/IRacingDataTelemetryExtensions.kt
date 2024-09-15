package iracing

import iracing.IRacingData
import iracing.telemetry.CameraStateFlags
import iracing.telemetry.CarRadar
import iracing.telemetry.EngineWarningsFlags
import iracing.telemetry.GamePitSvFlags
import iracing.telemetry.GameSessionFlags
import iracing.telemetry.GameSessionState
import iracing.telemetry.PaceFlags
import iracing.telemetry.TrackLocation
import java.util.EnumSet

/**
 * Pitstop windshield tearoff
 */
val IRacingData.dpWindshieldTearoff: Float
    get() = this.telemetry["dpWindshieldTearoff"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Pitstop rr cold tire pressure adjustment
 */
val IRacingData.dpRRTireColdPress: Float
    get() = this.telemetry["dpRRTireColdPress"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Pitstop rr tire change request
 */
val IRacingData.dpRRTireChange: Float
    get() = this.telemetry["dpRRTireChange"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Pitstop rf cold tire pressure adjustment
 */
val IRacingData.dpRFTireColdPress: Float
    get() = this.telemetry["dpRFTireColdPress"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Pitstop rf tire change request
 */
val IRacingData.dpRFTireChange: Float
    get() = this.telemetry["dpRFTireChange"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Pitstop lr tire cold pressure adjustment
 */
val IRacingData.dpLRTireColdPress: Float
    get() = this.telemetry["dpLRTireColdPress"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Pitstop lr tire change request
 */
val IRacingData.dpLRTireChange: Float
    get() = this.telemetry["dpLRTireChange"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Pitstop lf tire cold pressure adjustment
 */
val IRacingData.dpLFTireColdPress: Float
    get() = this.telemetry["dpLFTireColdPress"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Pitstop lf tire change request
 */
val IRacingData.dpLFTireChange: Float
    get() = this.telemetry["dpLFTireChange"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Pitstop fuel fill flag
 */
val IRacingData.dpFuelFill: Float
    get() = this.telemetry["dpFuelFill"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Pitstop fuel add amount
 */
val IRacingData.dpFuelAddKg: Float
    get() = this.telemetry["dpFuelAddKg"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Pitstop fast repair set
 */
val IRacingData.dpFastRepair: Float
    get() = this.telemetry["dpFastRepair"]?.unit?.toFloatOrNull() ?: 0f

/**
 * In car trigger car starter
 */
val IRacingData.dcStarter: Boolean
    get() = this.telemetry["dcStarter"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * In car traction control active
 */
val IRacingData.dcPitSpeedLimiterToggle: Boolean
    get() = this.telemetry["dcPitSpeedLimiterToggle"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * Yaw rate at 360 Hz
 */
val IRacingData.YawRate_ST: Float
    get() = this.telemetry["YawRate_ST"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Yaw rate
 */
val IRacingData.YawRate: Float
    get() = this.telemetry["YawRate"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Yaw orientation relative to north
 */
val IRacingData.YawNorth: Float
    get() = this.telemetry["YawNorth"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Yaw orientation
 */
val IRacingData.Yaw: Float
    get() = this.telemetry["Yaw"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Wind velocity at start/finish line
 */
val IRacingData.WindVel: Float
    get() = this.telemetry["WindVel"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Wind direction at start/finish line
 */
val IRacingData.WindDir: Float
    get() = this.telemetry["WindDir"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Weather type (0=constant  1=dynamic)
 */
val IRacingData.WeatherType: Float
    get() = this.telemetry["WeatherType"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Engine coolant temp
 */
val IRacingData.WaterTemp: Float
    get() = this.telemetry["WaterTemp"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Engine coolant level
 */
val IRacingData.WaterLevel: Float
    get() = this.telemetry["WaterLevel"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Engine voltage
 */
val IRacingData.Voltage: Float
    get() = this.telemetry["Voltage"]?.unit?.toFloatOrNull() ?: 0f

/**
 * True if video capture system is enabled
 */
val IRacingData.VidCapEnabled: Boolean
    get() = this.telemetry["VidCapEnabled"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * True if video currently being captured
 */
val IRacingData.VidCapActive: Boolean
    get() = this.telemetry["VidCapActive"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * Vertical acceleration (including gravity) at 360 Hz
 */
val IRacingData.VertAccel_ST: Float
    get() = this.telemetry["VertAccel_ST"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Vertical acceleration (including gravity)
 */
val IRacingData.VertAccel: Float
    get() = this.telemetry["VertAccel"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Z velocity
 */
val IRacingData.VelocityZ_ST: Float
    get() = this.telemetry["VelocityZ_ST"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Z velocity
 */
val IRacingData.VelocityZ: Float
    get() = this.telemetry["VelocityZ"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Y velocity
 */
val IRacingData.VelocityY_ST: Float
    get() = this.telemetry["VelocityY_ST"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Y velocity
 */
val IRacingData.VelocityY: Float
    get() = this.telemetry["VelocityY"]?.unit?.toFloatOrNull() ?: 0f

/**
 * X velocity
 */
val IRacingData.VelocityX_ST: Float
    get() = this.telemetry["VelocityX_ST"]?.unit?.toFloatOrNull() ?: 0f

/**
 * X velocity
 */
val IRacingData.VelocityX: Float
    get() = this.telemetry["VelocityX"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Temperature of track measured by crew around track
 */
val IRacingData.TrackTempCrew: Float
    get() = this.telemetry["TrackTempCrew"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Deprecated  set to TrackTempCrew
 */
val IRacingData.TrackTemp: Float
    get() = this.telemetry["TrackTemp"]?.unit?.toFloatOrNull() ?: 0f

/**
 * How many tire sets used so far
 */
val IRacingData.TireSetsUsed: Float
    get() = this.telemetry["TireSetsUsed"]?.unit?.toFloatOrNull() ?: 0f

/**
 * How many tire sets are remaining  255 is unlimited
 */
val IRacingData.TireSetsAvailable: Float
    get() = this.telemetry["TireSetsAvailable"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Players RR Tire Sound rumblestrip pitch
 */
val IRacingData.TireRR_RumblePitch: Float
    get() = this.telemetry["TireRR_RumblePitch"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Players RF Tire Sound rumblestrip pitch
 */
val IRacingData.TireRF_RumblePitch: Float
    get() = this.telemetry["TireRF_RumblePitch"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Players LR Tire Sound rumblestrip pitch
 */
val IRacingData.TireLR_RumblePitch: Float
    get() = this.telemetry["TireLR_RumblePitch"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Players LF Tire Sound rumblestrip pitch
 */
val IRacingData.TireLF_RumblePitch: Float
    get() = this.telemetry["TireLF_RumblePitch"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Raw throttle input 0=off throttle to 1=full throttle
 */
val IRacingData.ThrottleRaw: Float
    get() = this.telemetry["ThrottleRaw"]?.unit?.toFloatOrNull() ?: 0f

/**
 * 0=off throttle to 1=full throttle
 */
val IRacingData.Throttle: Float
    get() = this.telemetry["Throttle"]?.unit?.toFloatOrNull() ?: 0f

/**
 * True if steering wheel force is using linear mode
 */
val IRacingData.SteeringWheelUseLinear: Boolean
    get() = this.telemetry["SteeringWheelUseLinear"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * Output torque on steering shaft at 360 Hz
 */
val IRacingData.SteeringWheelTorque_ST: Float
    get() = this.telemetry["SteeringWheelTorque_ST"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Output torque on steering shaft
 */
val IRacingData.SteeringWheelTorque: Float
    get() = this.telemetry["SteeringWheelTorque"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Peak torque mapping to direct input units for FFB
 */
val IRacingData.SteeringWheelPeakForceNm: Float
    get() = this.telemetry["SteeringWheelPeakForceNm"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Force feedback % max torque on steering shaft signed stops
 */
val IRacingData.SteeringWheelPctTorqueSignStops: Float
    get() = this.telemetry["SteeringWheelPctTorqueSignStops"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Force feedback % max torque on steering shaft signed
 */
val IRacingData.SteeringWheelPctTorqueSign: Float
    get() = this.telemetry["SteeringWheelPctTorqueSign"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Force feedback % max torque on steering shaft unsigned
 */
val IRacingData.SteeringWheelPctTorque: Float
    get() = this.telemetry["SteeringWheelPctTorque"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Force feedback % max smoothing
 */
val IRacingData.SteeringWheelPctSmoothing: Float
    get() = this.telemetry["SteeringWheelPctSmoothing"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Force feedback % max damping
 */
val IRacingData.SteeringWheelPctDamper: Float
    get() = this.telemetry["SteeringWheelPctDamper"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Value of strength or max force slider in Nm for FFB
 */
val IRacingData.SteeringWheelMaxForceNm: Float
    get() = this.telemetry["SteeringWheelMaxForceNm"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Force feedback limiter strength limits impacts and oscillation
 */
val IRacingData.SteeringWheelLimiter: Float
    get() = this.telemetry["SteeringWheelLimiter"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Steering wheel max angle
 */
val IRacingData.SteeringWheelAngleMax: Float
    get() = this.telemetry["SteeringWheelAngleMax"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Steering wheel angle
 */
val IRacingData.SteeringWheelAngle: Float
    get() = this.telemetry["SteeringWheelAngle"]?.unit?.toFloatOrNull() ?: 0f

/**
 * GPS vehicle speed
 */
val IRacingData.Speed: Float
    get() = this.telemetry["Speed"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Sun angle clockwise from north in radians
 */
val IRacingData.SolarAzimuth: Float
    get() = this.telemetry["SolarAzimuth"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Sun angle above horizon in radians
 */
val IRacingData.SolarAltitude: Float
    get() = this.telemetry["SolarAltitude"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Skies (0=clear/1=p cloudy/2=m cloudy/3=overcast)
 */
val IRacingData.Skies: Float
    get() = this.telemetry["Skies"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Friction torque applied to gears when shifting or grinding
 */
val IRacingData.ShiftPowerPct: Float
    get() = this.telemetry["ShiftPowerPct"]?.unit?.toFloatOrNull() ?: 0f

/**
 * DEPRECATED use DriverCarSLBlinkRPM instead
 */
val IRacingData.ShiftIndicatorPct: Float
    get() = this.telemetry["ShiftIndicatorPct"]?.unit?.toFloatOrNull() ?: 0f

/**
 * RPM of shifter grinding noise
 */
val IRacingData.ShiftGrindRPM: Float
    get() = this.telemetry["ShiftGrindRPM"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Session ID
 */
val IRacingData.SessionUniqueID: Float
    get() = this.telemetry["SessionUniqueID"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Total number of seconds in session
 */
val IRacingData.SessionTimeTotal: Float
    get() = this.telemetry["SessionTimeTotal"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Seconds left till session ends
 */
val IRacingData.SessionTimeRemain: Float
    get() = this.telemetry["SessionTimeRemain"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Time of day in seconds
 */
val IRacingData.SessionTimeOfDay: Float
    get() = this.telemetry["SessionTimeOfDay"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Seconds since session start
 */
val IRacingData.SessionTime: Float
    get() = this.telemetry["SessionTime"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Current update number
 */
val IRacingData.SessionTick: Float
    get() = this.telemetry["SessionTick"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Player is currently completing a joker lap
 */
val IRacingData.SessionOnJokerLap: Boolean
    get() = this.telemetry["SessionOnJokerLap"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * Session number
 */
val IRacingData.SessionNum: Float
    get() = this.telemetry["SessionNum"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Total number of laps in session
 */
val IRacingData.SessionLapsTotal: Float
    get() = this.telemetry["SessionLapsTotal"]?.unit?.toFloatOrNull() ?: 0f

/**
 * New improved laps left till session ends
 */
val IRacingData.SessionLapsRemainEx: Float
    get() = this.telemetry["SessionLapsRemainEx"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Old laps left till session ends use SessionLapsRemainEx
 */
val IRacingData.SessionLapsRemain: Float
    get() = this.telemetry["SessionLapsRemain"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Joker laps remaining to be taken
 */
val IRacingData.SessionJokerLapsRemain: Float
    get() = this.telemetry["SessionJokerLapsRemain"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Roll rate at 360 Hz
 */
val IRacingData.RollRate_ST: Float
    get() = this.telemetry["RollRate_ST"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Roll rate
 */
val IRacingData.RollRate: Float
    get() = this.telemetry["RollRate"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Roll orientation
 */
val IRacingData.Roll: Float
    get() = this.telemetry["Roll"]?.unit?.toFloatOrNull() ?: 0f

/**
 * How many right tire sets used so far
 */
val IRacingData.RightTireSetsUsed: Float
    get() = this.telemetry["RightTireSetsUsed"]?.unit?.toFloatOrNull() ?: 0f

/**
 * How many right tire sets are remaining  255 is unlimited
 */
val IRacingData.RightTireSetsAvailable: Float
    get() = this.telemetry["RightTireSetsAvailable"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Seconds since replay session start
 */
val IRacingData.ReplaySessionTime: Float
    get() = this.telemetry["ReplaySessionTime"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Replay session number
 */
val IRacingData.ReplaySessionNum: Float
    get() = this.telemetry["ReplaySessionNum"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Replay playback speed
 */
val IRacingData.ReplayPlaySpeed: Float
    get() = this.telemetry["ReplayPlaySpeed"]?.unit?.toFloatOrNull() ?: 0f

/**
 * 0=not slow motion  1=replay is in slow motion
 */
val IRacingData.ReplayPlaySlowMotion: Boolean
    get() = this.telemetry["ReplayPlaySlowMotion"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * Integer replay frame number from end of tape
 */
val IRacingData.ReplayFrameNumEnd: Float
    get() = this.telemetry["ReplayFrameNumEnd"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Integer replay frame number (60 per second)
 */
val IRacingData.ReplayFrameNum: Float
    get() = this.telemetry["ReplayFrameNum"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Relative Humidity
 */
val IRacingData.RelativeHumidity: Float
    get() = this.telemetry["RelativeHumidity"]?.unit?.toFloatOrNull() ?: 0f

/**
 * How many rear tire sets used so far
 */
val IRacingData.RearTireSetsUsed: Float
    get() = this.telemetry["RearTireSetsUsed"]?.unit?.toFloatOrNull() ?: 0f

/**
 * How many rear tire sets are remaining  255 is unlimited
 */
val IRacingData.RearTireSetsAvailable: Float
    get() = this.telemetry["RearTireSetsAvailable"]?.unit?.toFloatOrNull() ?: 0f

/**
 * The radio index of the current person speaking on the radio
 */
val IRacingData.RadioTransmitRadioIdx: Float
    get() = this.telemetry["RadioTransmitRadioIdx"]?.unit?.toFloatOrNull() ?: 0f

/**
 * The frequency index of the current person speaking on the radio
 */
val IRacingData.RadioTransmitFrequencyIdx: Float
    get() = this.telemetry["RadioTransmitFrequencyIdx"]?.unit?.toFloatOrNull() ?: 0f

/**
 * The car index of the current person speaking on the radio
 */
val IRacingData.RadioTransmitCarIdx: Float
    get() = this.telemetry["RadioTransmitCarIdx"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Laps completed in race
 */
val IRacingData.RaceLaps: Float
    get() = this.telemetry["RaceLaps"]?.unit?.toFloatOrNull() ?: 0f

/**
 * RR tire right percent tread remaining
 */
val IRacingData.RRwearR: Float
    get() = this.telemetry["RRwearR"]?.unit?.toFloatOrNull() ?: 0f

/**
 * RR tire middle percent tread remaining
 */
val IRacingData.RRwearM: Float
    get() = this.telemetry["RRwearM"]?.unit?.toFloatOrNull() ?: 0f

/**
 * RR tire left percent tread remaining
 */
val IRacingData.RRwearL: Float
    get() = this.telemetry["RRwearL"]?.unit?.toFloatOrNull() ?: 0f

/**
 * RR tire right carcass temperature
 */
val IRacingData.RRtempCR: Float
    get() = this.telemetry["RRtempCR"]?.unit?.toFloatOrNull() ?: 1f

/**
 * RR tire middle carcass temperature
 */
val IRacingData.RRtempCM: Float
    get() = this.telemetry["RRtempCM"]?.unit?.toFloatOrNull() ?: 1f

/**
 * RR tire left carcass temperature
 */
val IRacingData.RRtempCL: Float
    get() = this.telemetry["RRtempCL"]?.unit?.toFloatOrNull() ?: 1f

/**
 * RR shock velocity at 360 Hz
 */
val IRacingData.RRshockVel_ST: Float
    get() = this.telemetry["RRshockVel_ST"]?.unit?.toFloatOrNull() ?: 0f

/**
 * RR shock velocity
 */
val IRacingData.RRshockVel: Float
    get() = this.telemetry["RRshockVel"]?.unit?.toFloatOrNull() ?: 0f

/**
 * RR shock deflection at 360 Hz
 */
val IRacingData.RRshockDefl_ST: Float
    get() = this.telemetry["RRshockDefl_ST"]?.unit?.toFloatOrNull() ?: 0f

/**
 * RR shock deflection
 */
val IRacingData.RRshockDefl: Float
    get() = this.telemetry["RRshockDefl"]?.unit?.toFloatOrNull() ?: 0f

/**
 * RR tire cold pressure  as set in the garage
 */
val IRacingData.RRcoldPressure: Float
    get() = this.telemetry["RRcoldPressure"]?.unit?.toFloatOrNull() ?: 0f

/**
 * RR brake line pressure
 */
val IRacingData.RRbrakeLinePress: Float
    get() = this.telemetry["RRbrakeLinePress"]?.unit?.toFloatOrNull() ?: 0f

/**
 * How many right rear tires used so far
 */
val IRacingData.RRTiresUsed: Float
    get() = this.telemetry["RRTiresUsed"]?.unit?.toFloatOrNull() ?: 0f

/**
 * How many right rear tires are remaining  255 is unlimited
 */
val IRacingData.RRTiresAvailable: Float
    get() = this.telemetry["RRTiresAvailable"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Engine rpm
 */
val IRacingData.RPM: Float
    get() = this.telemetry["RPM"]?.unit?.toFloatOrNull() ?: 0f

/**
 * RF tire right percent tread remaining
 */
val IRacingData.RFwearR: Float
    get() = this.telemetry["RFwearR"]?.unit?.toFloatOrNull() ?: 0f

/**
 * RF tire middle percent tread remaining
 */
val IRacingData.RFwearM: Float
    get() = this.telemetry["RFwearM"]?.unit?.toFloatOrNull() ?: 0f

/**
 * RF tire left percent tread remaining
 */
val IRacingData.RFwearL: Float
    get() = this.telemetry["RFwearL"]?.unit?.toFloatOrNull() ?: 0f

/**
 * RF tire right carcass temperature
 */
val IRacingData.RFtempCR: Float
    get() = this.telemetry["RFtempCR"]?.unit?.toFloatOrNull() ?: 1f

/**
 * RF tire middle carcass temperature
 */
val IRacingData.RFtempCM: Float
    get() = this.telemetry["RFtempCM"]?.unit?.toFloatOrNull() ?: 1f

/**
 * RF tire left carcass temperature
 */
val IRacingData.RFtempCL: Float
    get() = this.telemetry["RFtempCL"]?.unit?.toFloatOrNull() ?: 1f

/**
 * RF shock velocity at 360 Hz
 */
val IRacingData.RFshockVel_ST: Float
    get() = this.telemetry["RFshockVel_ST"]?.unit?.toFloatOrNull() ?: 0f

/**
 * RF shock velocity
 */
val IRacingData.RFshockVel: Float
    get() = this.telemetry["RFshockVel"]?.unit?.toFloatOrNull() ?: 0f

/**
 * RF shock deflection at 360 Hz
 */
val IRacingData.RFshockDefl_ST: Float
    get() = this.telemetry["RFshockDefl_ST"]?.unit?.toFloatOrNull() ?: 0f

/**
 * RF shock deflection
 */
val IRacingData.RFshockDefl: Float
    get() = this.telemetry["RFshockDefl"]?.unit?.toFloatOrNull() ?: 0f

/**
 * RF tire cold pressure  as set in the garage
 */
val IRacingData.RFcoldPressure: Float
    get() = this.telemetry["RFcoldPressure"]?.unit?.toFloatOrNull() ?: 0f

/**
 * RF brake line pressure
 */
val IRacingData.RFbrakeLinePress: Float
    get() = this.telemetry["RFbrakeLinePress"]?.unit?.toFloatOrNull() ?: 0f

/**
 * How many right front tires used so far
 */
val IRacingData.RFTiresUsed: Float
    get() = this.telemetry["RFTiresUsed"]?.unit?.toFloatOrNull() ?: 0f

/**
 * How many right front tires are remaining  255 is unlimited
 */
val IRacingData.RFTiresAvailable: Float
    get() = this.telemetry["RFTiresAvailable"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Push to talk button state
 */
val IRacingData.PushToTalk: Boolean
    get() = this.telemetry["PushToTalk"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * Push to pass button state
 */
val IRacingData.PushToPass: Boolean
    get() = this.telemetry["PushToPass"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * Players car current tire compound
 */
val IRacingData.PlayerTireCompound: Float
    get() = this.telemetry["PlayerTireCompound"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Players car number of fast repairs used
 */
val IRacingData.PlayerFastRepairsUsed: Float
    get() = this.telemetry["PlayerFastRepairsUsed"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Players weight penalty
 */
val IRacingData.PlayerCarWeightPenalty: Float
    get() = this.telemetry["PlayerCarWeightPenalty"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Players car is being towed if time is greater than zero
 */
val IRacingData.PlayerCarTowTime: Float
    get() = this.telemetry["PlayerCarTowTime"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Players team incident count for this session
 */
val IRacingData.PlayerCarTeamIncidentCount: Float
    get() = this.telemetry["PlayerCarTeamIncidentCount"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Players power adjust
 */
val IRacingData.PlayerCarPowerAdjust: Float
    get() = this.telemetry["PlayerCarPowerAdjust"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Players position in race
 */
val IRacingData.PlayerCarPosition: Float
    get() = this.telemetry["PlayerCarPosition"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Players own incident count for this session
 */
val IRacingData.PlayerCarMyIncidentCount: Float
    get() = this.telemetry["PlayerCarMyIncidentCount"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Players car is properly in there pitstall
 */
val IRacingData.PlayerCarInPitStall: Boolean
    get() = this.telemetry["PlayerCarInPitStall"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * Players carIdx
 */
val IRacingData.PlayerCarIdx: Float
    get() = this.telemetry["PlayerCarIdx"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Players dry tire set limit
 */
val IRacingData.PlayerCarDryTireSetLimit: Float
    get() = this.telemetry["PlayerCarDryTireSetLimit"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Teams current drivers incident count for this session
 */
val IRacingData.PlayerCarDriverIncidentCount: Float
    get() = this.telemetry["PlayerCarDriverIncidentCount"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Players class position in race
 */
val IRacingData.PlayerCarClassPosition: Float
    get() = this.telemetry["PlayerCarClassPosition"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Player car class id
 */
val IRacingData.PlayerCarClass: Float
    get() = this.telemetry["PlayerCarClass"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Is the player getting pit stop service
 */
val IRacingData.PitstopActive: Boolean
    get() = this.telemetry["PitstopActive"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * True if pit stop is allowed for the current player
 */
val IRacingData.PitsOpen: Boolean
    get() = this.telemetry["PitsOpen"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * Pitch rate at 360 Hz
 */
val IRacingData.PitchRate_ST: Float
    get() = this.telemetry["PitchRate_ST"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Pitch rate
 */
val IRacingData.PitchRate: Float
    get() = this.telemetry["PitchRate"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Pitch orientation
 */
val IRacingData.Pitch: Float
    get() = this.telemetry["Pitch"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Pit service pending tire compound
 */
val IRacingData.PitSvTireCompound: Float
    get() = this.telemetry["PitSvTireCompound"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Pit service right rear tire pressure
 */
val IRacingData.PitSvRRP: Float
    get() = this.telemetry["PitSvRRP"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Pit service right front tire pressure
 */
val IRacingData.PitSvRFP: Float
    get() = this.telemetry["PitSvRFP"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Pit service left rear tire pressure
 */
val IRacingData.PitSvLRP: Float
    get() = this.telemetry["PitSvLRP"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Pit service left front tire pressure
 */
val IRacingData.PitSvLFP: Float
    get() = this.telemetry["PitSvLFP"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Pit service fuel add amount
 */
val IRacingData.PitSvFuel: Float
    get() = this.telemetry["PitSvFuel"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Time left for mandatory pit repairs if repairs are active
 */
val IRacingData.PitRepairLeft: Float
    get() = this.telemetry["PitRepairLeft"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Time left for optional repairs if repairs are active
 */
val IRacingData.PitOptRepairLeft: Float
    get() = this.telemetry["PitOptRepairLeft"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Is the player car on pit road between the cones
 */
val IRacingData.OnPitRoad: Boolean
    get() = this.telemetry["OnPitRoad"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * True if it is ok to reload car textures at this time
 */
val IRacingData.OkToReloadTextures: Boolean
    get() = this.telemetry["OkToReloadTextures"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * Engine oil temperature
 */
val IRacingData.OilTemp: Float
    get() = this.telemetry["OilTemp"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Engine oil pressure
 */
val IRacingData.OilPress: Float
    get() = this.telemetry["OilPress"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Engine oil level
 */
val IRacingData.OilLevel: Float
    get() = this.telemetry["OilLevel"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Memory soft page faults per second
 */
val IRacingData.MemSoftPageFaultSec: Float
    get() = this.telemetry["MemSoftPageFaultSec"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Memory page faults per second
 */
val IRacingData.MemPageFaultSec: Float
    get() = this.telemetry["MemPageFaultSec"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Hybrid manual no boost state
 */
val IRacingData.ManualNoBoost: Boolean
    get() = this.telemetry["ManualNoBoost"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * Hybrid manual boost state
 */
val IRacingData.ManualBoost: Boolean
    get() = this.telemetry["ManualBoost"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * Engine manifold pressure
 */
val IRacingData.ManifoldPress: Float
    get() = this.telemetry["ManifoldPress"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Longitudinal acceleration (including gravity) at 360 Hz
 */
val IRacingData.LongAccel_ST: Float
    get() = this.telemetry["LongAccel_ST"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Longitudinal acceleration (including gravity)
 */
val IRacingData.LongAccel: Float
    get() = this.telemetry["LongAccel"]?.unit?.toFloatOrNull() ?: 0f

/**
 * True if the car_num texture will be loaded
 */
val IRacingData.LoadNumTextures: Boolean
    get() = this.telemetry["LoadNumTextures"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * How many left tire sets used so far
 */
val IRacingData.LeftTireSetsUsed: Float
    get() = this.telemetry["LeftTireSetsUsed"]?.unit?.toFloatOrNull() ?: 0f

/**
 * How many left tire sets are remaining  255 is unlimited
 */
val IRacingData.LeftTireSetsAvailable: Float
    get() = this.telemetry["LeftTireSetsAvailable"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Lateral acceleration (including gravity) at 360 Hz
 */
val IRacingData.LatAccel_ST: Float
    get() = this.telemetry["LatAccel_ST"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Lateral acceleration (including gravity)
 */
val IRacingData.LatAccel: Float
    get() = this.telemetry["LatAccel"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Player last N average lap time
 */
val IRacingData.LapLastNLapTime: Float
    get() = this.telemetry["LapLastNLapTime"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Players last lap time
 */
val IRacingData.LapLastLapTime: Float
    get() = this.telemetry["LapLastLapTime"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Player num consecutive clean laps completed for N average
 */
val IRacingData.LapLasNLapSeq: Float
    get() = this.telemetry["LapLasNLapSeq"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Percentage distance around lap
 */
val IRacingData.LapDistPct: Float
    get() = this.telemetry["LapDistPct"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Meters traveled from S/F this lap
 */
val IRacingData.LapDist: Float
    get() = this.telemetry["LapDist"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Delta time for session optimal lap is valid
 */
val IRacingData.LapDeltaToSessionOptimalLap_OK: Boolean
    get() = this.telemetry["LapDeltaToSessionOptimalLap_OK"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * Rate of change of delta time for session optimal lap
 */
val IRacingData.LapDeltaToSessionOptimalLap_DD: Float
    get() = this.telemetry["LapDeltaToSessionOptimalLap_DD"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Delta time for session optimal lap
 */
val IRacingData.LapDeltaToSessionOptimalLap: Float
    get() = this.telemetry["LapDeltaToSessionOptimalLap"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Delta time for session last lap is valid
 */
val IRacingData.LapDeltaToSessionLastlLap_OK: Boolean
    get() = this.telemetry["LapDeltaToSessionLastlLap_OK"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * Rate of change of delta time for session last lap
 */
val IRacingData.LapDeltaToSessionLastlLap_DD: Float
    get() = this.telemetry["LapDeltaToSessionLastlLap_DD"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Delta time for session last lap
 */
val IRacingData.LapDeltaToSessionLastlLap: Float
    get() = this.telemetry["LapDeltaToSessionLastlLap"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Delta time for session best lap is valid
 */
val IRacingData.LapDeltaToSessionBestLap_OK: Boolean
    get() = this.telemetry["LapDeltaToSessionBestLap_OK"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * Rate of change of delta time for session best lap
 */
val IRacingData.LapDeltaToSessionBestLap_DD: Float
    get() = this.telemetry["LapDeltaToSessionBestLap_DD"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Delta time for session best lap
 */
val IRacingData.LapDeltaToSessionBestLap: Float
    get() = this.telemetry["LapDeltaToSessionBestLap"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Delta time for optimal lap is valid
 */
val IRacingData.LapDeltaToOptimalLap_OK: Boolean
    get() = this.telemetry["LapDeltaToOptimalLap_OK"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * Rate of change of delta time for optimal lap
 */
val IRacingData.LapDeltaToOptimalLap_DD: Float
    get() = this.telemetry["LapDeltaToOptimalLap_DD"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Delta time for optimal lap
 */
val IRacingData.LapDeltaToOptimalLap: Float
    get() = this.telemetry["LapDeltaToOptimalLap"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Delta time for best lap is valid
 */
val IRacingData.LapDeltaToBestLap_OK: Boolean
    get() = this.telemetry["LapDeltaToBestLap_OK"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * Rate of change of delta time for best lap
 */
val IRacingData.LapDeltaToBestLap_DD: Float
    get() = this.telemetry["LapDeltaToBestLap_DD"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Delta time for best lap
 */
val IRacingData.LapDeltaToBestLap: Float
    get() = this.telemetry["LapDeltaToBestLap"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Estimate of players current lap time as shown in F3 box
 */
val IRacingData.LapCurrentLapTime: Float
    get() = this.telemetry["LapCurrentLapTime"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Laps completed count
 */
val IRacingData.LapCompleted: Float
    get() = this.telemetry["LapCompleted"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Player best N average lap time
 */
val IRacingData.LapBestNLapTime: Float
    get() = this.telemetry["LapBestNLapTime"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Player last lap in best N average lap time
 */
val IRacingData.LapBestNLapLap: Float
    get() = this.telemetry["LapBestNLapLap"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Players best lap time
 */
val IRacingData.LapBestLapTime: Float
    get() = this.telemetry["LapBestLapTime"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Players best lap number
 */
val IRacingData.LapBestLap: Float
    get() = this.telemetry["LapBestLap"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Laps started count
 */
val IRacingData.Lap: Float
    get() = this.telemetry["Lap"]?.unit?.toFloatOrNull() ?: 0f

/**
 * LR tire right percent tread remaining
 */
val IRacingData.LRwearR: Float
    get() = this.telemetry["LRwearR"]?.unit?.toFloatOrNull() ?: 0f

/**
 * LR tire middle percent tread remaining
 */
val IRacingData.LRwearM: Float
    get() = this.telemetry["LRwearM"]?.unit?.toFloatOrNull() ?: 0f

/**
 * LR tire left percent tread remaining
 */
val IRacingData.LRwearL: Float
    get() = this.telemetry["LRwearL"]?.unit?.toFloatOrNull() ?: 0f

/**
 * LR tire right carcass temperature
 */
val IRacingData.LRtempCR: Float
    get() = this.telemetry["LRtempCR"]?.unit?.toFloatOrNull() ?: 1f

/**
 * LR tire middle carcass temperature
 */
val IRacingData.LRtempCM: Float
    get() = this.telemetry["LRtempCM"]?.unit?.toFloatOrNull() ?: 1f

/**
 * LR tire left carcass temperature
 */
val IRacingData.LRtempCL: Float
    get() = this.telemetry["LRtempCL"]?.unit?.toFloatOrNull() ?: 1f

/**
 * LR shock velocity at 360 Hz
 */
val IRacingData.LRshockVel_ST: Float
    get() = this.telemetry["LRshockVel_ST"]?.unit?.toFloatOrNull() ?: 0f

/**
 * LR shock velocity
 */
val IRacingData.LRshockVel: Float
    get() = this.telemetry["LRshockVel"]?.unit?.toFloatOrNull() ?: 0f

/**
 * LR shock deflection at 360 Hz
 */
val IRacingData.LRshockDefl_ST: Float
    get() = this.telemetry["LRshockDefl_ST"]?.unit?.toFloatOrNull() ?: 0f

/**
 * LR shock deflection
 */
val IRacingData.LRshockDefl: Float
    get() = this.telemetry["LRshockDefl"]?.unit?.toFloatOrNull() ?: 0f

/**
 * LR tire cold pressure  as set in the garage
 */
val IRacingData.LRcoldPressure: Float
    get() = this.telemetry["LRcoldPressure"]?.unit?.toFloatOrNull() ?: 0f

/**
 * LR brake line pressure
 */
val IRacingData.LRbrakeLinePress: Float
    get() = this.telemetry["LRbrakeLinePress"]?.unit?.toFloatOrNull() ?: 0f

/**
 * How many left rear tires used so far
 */
val IRacingData.LRTiresUsed: Float
    get() = this.telemetry["LRTiresUsed"]?.unit?.toFloatOrNull() ?: 0f

/**
 * How many left rear tires are remaining  255 is unlimited
 */
val IRacingData.LRTiresAvailable: Float
    get() = this.telemetry["LRTiresAvailable"]?.unit?.toFloatOrNull() ?: 0f

/**
 * LF tire right percent tread remaining
 */
val IRacingData.LFwearR: Float
    get() = this.telemetry["LFwearR"]?.unit?.toFloatOrNull() ?: 0f

/**
 * LF tire middle percent tread remaining
 */
val IRacingData.LFwearM: Float
    get() = this.telemetry["LFwearM"]?.unit?.toFloatOrNull() ?: 0f

/**
 * LF tire left percent tread remaining
 */
val IRacingData.LFwearL: Float
    get() = this.telemetry["LFwearL"]?.unit?.toFloatOrNull() ?: 0f

/**
 * LF tire right carcass temperature
 */
val IRacingData.LFtempCR: Float
    get() = this.telemetry["LFtempCR"]?.unit?.toFloatOrNull() ?: 1f

/**
 * LF tire middle carcass temperature
 */
val IRacingData.LFtempCM: Float
    get() = this.telemetry["LFtempCM"]?.unit?.toFloatOrNull() ?: 1f

/**
 * LF tire left carcass temperature
 */
val IRacingData.LFtempCL: Float
    get() = this.telemetry["LFtempCL"]?.unit?.toFloatOrNull() ?: 1f

/**
 * LF shock velocity at 360 Hz
 */
val IRacingData.LFshockVel_ST: Float
    get() = this.telemetry["LFshockVel_ST"]?.unit?.toFloatOrNull() ?: 0f

/**
 * LF shock velocity
 */
val IRacingData.LFshockVel: Float
    get() = this.telemetry["LFshockVel"]?.unit?.toFloatOrNull() ?: 0f

/**
 * LF shock deflection at 360 Hz
 */
val IRacingData.LFshockDefl_ST: Float
    get() = this.telemetry["LFshockDefl_ST"]?.unit?.toFloatOrNull() ?: 0f

/**
 * LF shock deflection
 */
val IRacingData.LFshockDefl: Float
    get() = this.telemetry["LFshockDefl"]?.unit?.toFloatOrNull() ?: 0f

/**
 * LF tire cold pressure  as set in the garage
 */
val IRacingData.LFcoldPressure: Float
    get() = this.telemetry["LFcoldPressure"]?.unit?.toFloatOrNull() ?: 0f

/**
 * LF brake line pressure
 */
val IRacingData.LFbrakeLinePress: Float
    get() = this.telemetry["LFbrakeLinePress"]?.unit?.toFloatOrNull() ?: 0f

/**
 * How many left front tires used so far
 */
val IRacingData.LFTiresUsed: Float
    get() = this.telemetry["LFTiresUsed"]?.unit?.toFloatOrNull() ?: 0f

/**
 * How many left front tires are remaining  255 is unlimited
 */
val IRacingData.LFTiresAvailable: Float
    get() = this.telemetry["LFTiresAvailable"]?.unit?.toFloatOrNull() ?: 0f

/**
 * 0=replay not playing  1=replay playing
 */
val IRacingData.IsReplayPlaying: Boolean
    get() = this.telemetry["IsReplayPlaying"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * 1=Car on track physics running
 */
val IRacingData.IsOnTrackCar: Boolean
    get() = this.telemetry["IsOnTrackCar"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * 1=Car on track physics running with player in car
 */
val IRacingData.IsOnTrack: Boolean
    get() = this.telemetry["IsOnTrack"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * 1=Car in garage physics running
 */
val IRacingData.IsInGarage: Boolean
    get() = this.telemetry["IsInGarage"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * 1=Garage screen is visible
 */
val IRacingData.IsGarageVisible: Boolean
    get() = this.telemetry["IsGarageVisible"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * 0=disk based telemetry turned off  1=turned on
 */
val IRacingData.IsDiskLoggingEnabled: Boolean
    get() = this.telemetry["IsDiskLoggingEnabled"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * 0=disk based telemetry file not being written  1=being written
 */
val IRacingData.IsDiskLoggingActive: Boolean
    get() = this.telemetry["IsDiskLoggingActive"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * Raw handbrake input 0=handbrake released to 1=max force
 */
val IRacingData.HandbrakeRaw: Float
    get() = this.telemetry["HandbrakeRaw"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Percent of available tim gpu took with a 1 sec avg
 */
val IRacingData.GpuUsage: Float
    get() = this.telemetry["GpuUsage"]?.unit?.toFloatOrNull() ?: 0f

/**
 * -1=reverse  0=neutral  1..n=current gear
 */
val IRacingData.Gear: Float
    get() = this.telemetry["Gear"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Engine fuel used instantaneous
 */
val IRacingData.FuelUsePerHour: Float
    get() = this.telemetry["FuelUsePerHour"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Engine fuel pressure
 */
val IRacingData.FuelPress: Float
    get() = this.telemetry["FuelPress"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Percent fuel remaining
 */
val IRacingData.FuelLevelPct: Float
    get() = this.telemetry["FuelLevelPct"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Liters of fuel remaining
 */
val IRacingData.FuelLevel: Float
    get() = this.telemetry["FuelLevel"]?.unit?.toFloatOrNull() ?: 0f

/**
 * How many front tire sets used so far
 */
val IRacingData.FrontTireSetsUsed: Float
    get() = this.telemetry["FrontTireSetsUsed"]?.unit?.toFloatOrNull() ?: 0f

/**
 * How many front tire sets are remaining  255 is unlimited
 */
val IRacingData.FrontTireSetsAvailable: Float
    get() = this.telemetry["FrontTireSetsAvailable"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Average frames per second
 */
val IRacingData.FrameRate: Float
    get() = this.telemetry["FrameRate"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Fog level
 */
val IRacingData.FogLevel: Float
    get() = this.telemetry["FogLevel"]?.unit?.toFloatOrNull() ?: 0f

/**
 * How many fast repairs used so far
 */
val IRacingData.FastRepairUsed: Float
    get() = this.telemetry["FastRepairUsed"]?.unit?.toFloatOrNull() ?: 0f

/**
 * How many fast repairs left  255 is unlimited
 */
val IRacingData.FastRepairAvailable: Float
    get() = this.telemetry["FastRepairAvailable"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Indicate action the reset key will take 0 enter 1 exit 2 reset
 */
val IRacingData.EnterExitReset: Float
    get() = this.telemetry["EnterExitReset"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Engine0Engine rpm
 */
val IRacingData.Engine0_RPM: Float
    get() = this.telemetry["Engine0_RPM"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Driver activated flag
 */
val IRacingData.DriverMarker: Boolean
    get() = this.telemetry["DriverMarker"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * Default units for the user interface 0 = english 1 = metric
 */
val IRacingData.DisplayUnits: Float
    get() = this.telemetry["DisplayUnits"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Status of driver change lap requirements
 */
val IRacingData.DCLapStatus: Float
    get() = this.telemetry["DCLapStatus"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Number of team drivers who have run a stint
 */
val IRacingData.DCDriversSoFar: Float
    get() = this.telemetry["DCDriversSoFar"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Percent of available tim fg thread took with a 1 sec avg
 */
val IRacingData.CpuUsageFG: Float
    get() = this.telemetry["CpuUsageFG"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Percent of available tim bg thread took with a 1 sec avg
 */
val IRacingData.CpuUsageBG: Float
    get() = this.telemetry["CpuUsageBG"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Raw clutch input 0=disengaged to 1=fully engaged
 */
val IRacingData.ClutchRaw: Float
    get() = this.telemetry["ClutchRaw"]?.unit?.toFloatOrNull() ?: 0f

/**
 * 0=disengaged to 1=fully engaged
 */
val IRacingData.Clutch: Float
    get() = this.telemetry["Clutch"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Communications quality
 */
val IRacingData.ChanQuality: Float
    get() = this.telemetry["ChanQuality"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Partner communications quality
 */
val IRacingData.ChanPartnerQuality: Float
    get() = this.telemetry["ChanPartnerQuality"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Communications latency
 */
val IRacingData.ChanLatency: Float
    get() = this.telemetry["ChanLatency"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Communications server clock skew
 */
val IRacingData.ChanClockSkew: Float
    get() = this.telemetry["ChanClockSkew"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Communications average latency
 */
val IRacingData.ChanAvgLatency: Float
    get() = this.telemetry["ChanAvgLatency"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Cars current tire compound
 */
val IRacingData.CarIdxTireCompound: Float
    get() = this.telemetry["CarIdxTireCompound"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Steering wheel angle by car index
 */
val IRacingData.CarIdxSteer: Float
    get() = this.telemetry["CarIdxSteer"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Engine rpm by car index
 */
val IRacingData.CarIdxRPM: Float
    get() = this.telemetry["CarIdxRPM"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Cars Qual tire compound is locked-in
 */
val IRacingData.CarIdxQualTireCompoundLocked: Boolean
    get() = this.telemetry["CarIdxQualTireCompoundLocked"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * Cars Qual tire compound
 */
val IRacingData.CarIdxQualTireCompound: Float
    get() = this.telemetry["CarIdxQualTireCompound"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Cars position in race by car index
 */
val IRacingData.CarIdxPosition: Float
    get() = this.telemetry["CarIdxPosition"]?.unit?.toFloatOrNull() ?: 0f

/**
 * What row cars are pacing in  or -1 if not pacing
 */
val IRacingData.CarIdxPaceRow: Float
    get() = this.telemetry["CarIdxPaceRow"]?.unit?.toFloatOrNull() ?: 0f

/**
 * What line cars are pacing in  or -1 if not pacing
 */
val IRacingData.CarIdxPaceLine: Float
    get() = this.telemetry["CarIdxPaceLine"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Push2Pass active or not
 */
val IRacingData.CarIdxP2P_Status: Boolean
    get() = this.telemetry["CarIdxP2P_Status"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * Push2Pass count of usage (or remaining in Race)
 */
val IRacingData.CarIdxP2P_Count: Float
    get() = this.telemetry["CarIdxP2P_Count"]?.unit?.toFloatOrNull() ?: 0f

/**
 * On pit road between the cones by car index
 */
val IRacingData.CarIdxOnPitRoad: Boolean
    get() = this.telemetry["CarIdxOnPitRoad"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * Cars last lap time
 */
val IRacingData.CarIdxLastLapTime: Float
    get() = this.telemetry["CarIdxLastLapTime"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Percentage distance around lap by car index
 */
val IRacingData.CarIdxLapDistPct: Float
    get() = this.telemetry["CarIdxLapDistPct"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Laps completed by car index
 */
val IRacingData.CarIdxLapCompleted: Float
    get() = this.telemetry["CarIdxLapCompleted"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Laps started by car index
 */
val IRacingData.CarIdxLap: Float
    get() = this.telemetry["CarIdxLap"]?.unit?.toFloatOrNull() ?: 0f

/**
 * -1=reverse  0=neutral  1..n=current gear by car index
 */
val IRacingData.CarIdxGear: Float
    get() = this.telemetry["CarIdxGear"]?.unit?.toFloatOrNull() ?: 0f

/**
 * How many fast repairs each car has used
 */
val IRacingData.CarIdxFastRepairsUsed: Float
    get() = this.telemetry["CarIdxFastRepairsUsed"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Race time behind leader or fastest lap time otherwise
 */
val IRacingData.CarIdxF2Time: Float
    get() = this.telemetry["CarIdxF2Time"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Estimated time to reach current location on track
 */
val IRacingData.CarIdxEstTime: Float
    get() = this.telemetry["CarIdxEstTime"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Cars class position in race by car index
 */
val IRacingData.CarIdxClassPosition: Float
    get() = this.telemetry["CarIdxClassPosition"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Cars class id by car index
 */
val IRacingData.CarIdxClass: Float
    get() = this.telemetry["CarIdxClass"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Cars best lap time
 */
val IRacingData.CarIdxBestLapTime: Float
    get() = this.telemetry["CarIdxBestLapTime"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Cars best lap number
 */
val IRacingData.CarIdxBestLapNum: Float
    get() = this.telemetry["CarIdxBestLapNum"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Active camera group number
 */
val IRacingData.CamGroupNumber: Float
    get() = this.telemetry["CamGroupNumber"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Active camera's focus car index
 */
val IRacingData.CamCarIdx: Float
    get() = this.telemetry["CamCarIdx"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Active camera number
 */
val IRacingData.CamCameraNumber: Float
    get() = this.telemetry["CamCameraNumber"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Raw brake input 0=brake released to 1=max pedal force
 */
val IRacingData.BrakeRaw: Float
    get() = this.telemetry["BrakeRaw"]?.unit?.toFloatOrNull() ?: 0f

/**
 * true if abs is currently reducing brake force pressure
 */
val IRacingData.BrakeABSactive: Boolean
    get() = this.telemetry["BrakeABSactive"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * 0=brake released to 1=max pedal force
 */
val IRacingData.Brake: Float
    get() = this.telemetry["Brake"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Temperature of air at start/finish line
 */
val IRacingData.AirTemp: Float
    get() = this.telemetry["AirTemp"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Pressure of air at start/finish line
 */
val IRacingData.AirPressure: Float
    get() = this.telemetry["AirPressure"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Density of air at start/finish line
 */
val IRacingData.AirDensity: Float
    get() = this.telemetry["AirDensity"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Pitstop auto fill fuel system enabled
 */
val IRacingData.dpFuelAutoFillEnabled: Float
    get() = this.telemetry["dpFuelAutoFillEnabled"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Pitstop auto fill fuel next stop flag
 */
val IRacingData.dpFuelAutoFillActive: Float
    get() = this.telemetry["dpFuelAutoFillActive"]?.unit?.toFloatOrNull() ?: 0f

/**
 * In car momentarily turn on wipers
 */
val IRacingData.dcTriggerWindshieldWipers: Boolean
    get() = this.telemetry["dcTriggerWindshieldWipers"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * In car turn wipers on or off
 */
val IRacingData.dcToggleWindshieldWipers: Boolean
    get() = this.telemetry["dcToggleWindshieldWipers"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * In car low fuel accept
 */
val IRacingData.dcLowFuelAccept: Boolean
    get() = this.telemetry["dcLowFuelAccept"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * In car headlight flash control active
 */
val IRacingData.dcHeadlightFlash: Boolean
    get() = this.telemetry["dcHeadlightFlash"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * In car dash display page adjustment
 */
val IRacingData.dcDashPage: Float
    get() = this.telemetry["dcDashPage"]?.unit?.toFloatOrNull() ?: 0f

/**
 * In car brake bias adjustment
 */
val IRacingData.dcBrakeBias: Float
    get() = this.telemetry["dcBrakeBias"]?.unit?.toFloatOrNull() ?: 0f

/**
 * The steward says rain tires can be used
 */
val IRacingData.WeatherDeclaredWet: Boolean
    get() = this.telemetry["WeatherDeclaredWet"]?.unit?.toBooleanStrictOrNull() ?: false

/**
 * Force feedback % max intensity
 */
val IRacingData.SteeringWheelPctIntensity: Float
    get() = this.telemetry["SteeringWheelPctIntensity"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Precipitation at start/finish line
 */
val IRacingData.Precipitation: Float
    get() = this.telemetry["Precipitation"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Shift light shift rpm
 */
val IRacingData.PlayerCarSLShiftRPM: Float
    get() = this.telemetry["PlayerCarSLShiftRPM"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Shift light last light rpm
 */
val IRacingData.PlayerCarSLLastRPM: Float
    get() = this.telemetry["PlayerCarSLLastRPM"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Shift light first light rpm
 */
val IRacingData.PlayerCarSLFirstRPM: Float
    get() = this.telemetry["PlayerCarSLFirstRPM"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Shift light blink rpm
 */
val IRacingData.PlayerCarSLBlinkRPM: Float
    get() = this.telemetry["PlayerCarSLBlinkRPM"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Distance to first car behind player in meters
 */
val IRacingData.CarDistBehind: Float
    get() = this.telemetry["CarDistBehind"]?.unit?.toFloatOrNull() ?: 0f

/**
 * Distance to first car in front of player in meters
 */
val IRacingData.CarDistAhead: Float
    get() = this.telemetry["CarDistAhead"]?.unit?.toFloatOrNull() ?: 0f

val IRacingData.CamCameraState: EnumSet<CameraStateFlags>
    get() = CameraStateFlags.fromValue(this.telemetry["CamCameraState"]?.unit?.toIntOrNull() ?: 0)

val IRacingData.CarIdxPaceFlags: EnumSet<PaceFlags>
    get() = PaceFlags.fromValue(this.telemetry["CarIdxPaceFlags"]?.unit?.toIntOrNull() ?: 0)

val IRacingData.PitSvFlags: EnumSet<GamePitSvFlags>
    get() = GamePitSvFlags.fromValue(this.telemetry["PitSvFlags"]?.unit?.toIntOrNull() ?: 0)

val IRacingData.SessionFlags: EnumSet<GameSessionFlags>
    get() = GameSessionFlags.fromValue(this.telemetry["SessionFlags"]?.unit?.toULongOrNull() ?: 0u)

val IRacingData.EngineWarnings: EnumSet<EngineWarningsFlags>
    get() = EngineWarningsFlags.fromValue(this.telemetry["EngineWarnings"]?.unit?.toIntOrNull() ?: 0)

val IRacingData.TrackWetness: Int
    get() = this.telemetry["TrackWetness"]?.unit?.toIntOrNull() ?: 0

val IRacingData.PaceMode: Int
    get() = this.telemetry["PaceMode"]?.unit?.toIntOrNull() ?: 0

val IRacingData.PlayerCarPitSvStatus: Int
    get() = this.telemetry["PlayerCarPitSvStatus"]?.unit?.toIntOrNull() ?: 0

val IRacingData.PlayerTrackSurfaceMaterial: Int
    get() = this.telemetry["PlayerTrackSurfaceMaterial"]?.unit?.toIntOrNull() ?: 0

val IRacingData.PlayerTrackSurface: TrackLocation
    get() = TrackLocation.fromValue(this.telemetry["PlayerTrackSurface"]?.unit?.toIntOrNull() ?: 0)

val IRacingData.SessionState: GameSessionState
    get() = GameSessionState.fromValue(this.telemetry["SessionState"]?.unit?.toIntOrNull() ?: 0)

val IRacingData.CarLeftRight: CarRadar
    get() = CarRadar.fromValue(this.telemetry["CarLeftRight"]?.unit?.toIntOrNull() ?: 0)

val IRacingData.CarIdxTrackSurfaceMaterial: Int
    get() = this.telemetry["CarIdxTrackSurfaceMaterial"]?.unit?.toIntOrNull() ?: 0

val IRacingData.CarIdxTrackSurface: TrackLocation
    get() = TrackLocation.fromValue(this.telemetry["CarIdxTrackSurface"]?.unit?.toIntOrNull() ?: 0)

val IRacingData.CarIdxSessionFlags: Int
    get() = this.telemetry["CarIdxSessionFlags"]?.unit?.toIntOrNull() ?: 0