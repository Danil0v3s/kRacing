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
val IRacingData.Telemetry.dpWindshieldTearoff: Float
    get() = this.telemetry["dpWindshieldTearoff"]?.value?.toFloatOrNull() ?: 0f

/**
 * Pitstop rr cold tire pressure adjustment
 */
val IRacingData.Telemetry.dpRRTireColdPress: Float
    get() = this.telemetry["dpRRTireColdPress"]?.value?.toFloatOrNull() ?: 0f

/**
 * Pitstop rr tire change request
 */
val IRacingData.Telemetry.dpRRTireChange: Float
    get() = this.telemetry["dpRRTireChange"]?.value?.toFloatOrNull() ?: 0f

/**
 * Pitstop rf cold tire pressure adjustment
 */
val IRacingData.Telemetry.dpRFTireColdPress: Float
    get() = this.telemetry["dpRFTireColdPress"]?.value?.toFloatOrNull() ?: 0f

/**
 * Pitstop rf tire change request
 */
val IRacingData.Telemetry.dpRFTireChange: Float
    get() = this.telemetry["dpRFTireChange"]?.value?.toFloatOrNull() ?: 0f

/**
 * Pitstop lr tire cold pressure adjustment
 */
val IRacingData.Telemetry.dpLRTireColdPress: Float
    get() = this.telemetry["dpLRTireColdPress"]?.value?.toFloatOrNull() ?: 0f

/**
 * Pitstop lr tire change request
 */
val IRacingData.Telemetry.dpLRTireChange: Float
    get() = this.telemetry["dpLRTireChange"]?.value?.toFloatOrNull() ?: 0f

/**
 * Pitstop lf tire cold pressure adjustment
 */
val IRacingData.Telemetry.dpLFTireColdPress: Float
    get() = this.telemetry["dpLFTireColdPress"]?.value?.toFloatOrNull() ?: 0f

/**
 * Pitstop lf tire change request
 */
val IRacingData.Telemetry.dpLFTireChange: Float
    get() = this.telemetry["dpLFTireChange"]?.value?.toFloatOrNull() ?: 0f

/**
 * Pitstop fuel fill flag
 */
val IRacingData.Telemetry.dpFuelFill: Float
    get() = this.telemetry["dpFuelFill"]?.value?.toFloatOrNull() ?: 0f

/**
 * Pitstop fuel add amount
 */
val IRacingData.Telemetry.dpFuelAddKg: Float
    get() = this.telemetry["dpFuelAddKg"]?.value?.toFloatOrNull() ?: 0f

/**
 * Pitstop fast repair set
 */
val IRacingData.Telemetry.dpFastRepair: Float
    get() = this.telemetry["dpFastRepair"]?.value?.toFloatOrNull() ?: 0f

/**
 * In car trigger car starter
 */
val IRacingData.Telemetry.dcStarter: Boolean
    get() = this.telemetry["dcStarter"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * In car traction control active
 */
val IRacingData.Telemetry.dcPitSpeedLimiterToggle: Boolean
    get() = this.telemetry["dcPitSpeedLimiterToggle"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * Yaw rate at 360 Hz
 */
val IRacingData.Telemetry.YawRate_ST: Float
    get() = this.telemetry["YawRate_ST"]?.value?.toFloatOrNull() ?: 0f

/**
 * Yaw rate
 */
val IRacingData.Telemetry.YawRate: Float
    get() = this.telemetry["YawRate"]?.value?.toFloatOrNull() ?: 0f

/**
 * Yaw orientation relative to north
 */
val IRacingData.Telemetry.YawNorth: Float
    get() = this.telemetry["YawNorth"]?.value?.toFloatOrNull() ?: 0f

/**
 * Yaw orientation
 */
val IRacingData.Telemetry.Yaw: Float
    get() = this.telemetry["Yaw"]?.value?.toFloatOrNull() ?: 0f

/**
 * Wind velocity at start/finish line
 */
val IRacingData.Telemetry.WindVel: Float
    get() = this.telemetry["WindVel"]?.value?.toFloatOrNull() ?: 0f

/**
 * Wind direction at start/finish line
 */
val IRacingData.Telemetry.WindDir: Float
    get() = this.telemetry["WindDir"]?.value?.toFloatOrNull() ?: 0f

/**
 * Weather type (0=constant  1=dynamic)
 */
val IRacingData.Telemetry.WeatherType: Float
    get() = this.telemetry["WeatherType"]?.value?.toFloatOrNull() ?: 0f

/**
 * Engine coolant temp
 */
val IRacingData.Telemetry.WaterTemp: Float
    get() = this.telemetry["WaterTemp"]?.value?.toFloatOrNull() ?: 0f

/**
 * Engine coolant level
 */
val IRacingData.Telemetry.WaterLevel: Float
    get() = this.telemetry["WaterLevel"]?.value?.toFloatOrNull() ?: 0f

/**
 * Engine voltage
 */
val IRacingData.Telemetry.Voltage: Float
    get() = this.telemetry["Voltage"]?.value?.toFloatOrNull() ?: 0f

/**
 * True if video capture system is enabled
 */
val IRacingData.Telemetry.VidCapEnabled: Boolean
    get() = this.telemetry["VidCapEnabled"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * True if video currently being captured
 */
val IRacingData.Telemetry.VidCapActive: Boolean
    get() = this.telemetry["VidCapActive"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * Vertical acceleration (including gravity) at 360 Hz
 */
val IRacingData.Telemetry.VertAccel_ST: Float
    get() = this.telemetry["VertAccel_ST"]?.value?.toFloatOrNull() ?: 0f

/**
 * Vertical acceleration (including gravity)
 */
val IRacingData.Telemetry.VertAccel: Float
    get() = this.telemetry["VertAccel"]?.value?.toFloatOrNull() ?: 0f

/**
 * Z velocity
 */
val IRacingData.Telemetry.VelocityZ_ST: Float
    get() = this.telemetry["VelocityZ_ST"]?.value?.toFloatOrNull() ?: 0f

/**
 * Z velocity
 */
val IRacingData.Telemetry.VelocityZ: Float
    get() = this.telemetry["VelocityZ"]?.value?.toFloatOrNull() ?: 0f

/**
 * Y velocity
 */
val IRacingData.Telemetry.VelocityY_ST: Float
    get() = this.telemetry["VelocityY_ST"]?.value?.toFloatOrNull() ?: 0f

/**
 * Y velocity
 */
val IRacingData.Telemetry.VelocityY: Float
    get() = this.telemetry["VelocityY"]?.value?.toFloatOrNull() ?: 0f

/**
 * X velocity
 */
val IRacingData.Telemetry.VelocityX_ST: Float
    get() = this.telemetry["VelocityX_ST"]?.value?.toFloatOrNull() ?: 0f

/**
 * X velocity
 */
val IRacingData.Telemetry.VelocityX: Float
    get() = this.telemetry["VelocityX"]?.value?.toFloatOrNull() ?: 0f

/**
 * Temperature of track measured by crew around track
 */
val IRacingData.Telemetry.TrackTempCrew: Float
    get() = this.telemetry["TrackTempCrew"]?.value?.toFloatOrNull() ?: 0f

/**
 * Deprecated  set to TrackTempCrew
 */
val IRacingData.Telemetry.TrackTemp: Float
    get() = this.telemetry["TrackTemp"]?.value?.toFloatOrNull() ?: 0f

/**
 * How many tire sets used so far
 */
val IRacingData.Telemetry.TireSetsUsed: Float
    get() = this.telemetry["TireSetsUsed"]?.value?.toFloatOrNull() ?: 0f

/**
 * How many tire sets are remaining  255 is unlimited
 */
val IRacingData.Telemetry.TireSetsAvailable: Float
    get() = this.telemetry["TireSetsAvailable"]?.value?.toFloatOrNull() ?: 0f

/**
 * Players RR Tire Sound rumblestrip pitch
 */
val IRacingData.Telemetry.TireRR_RumblePitch: Float
    get() = this.telemetry["TireRR_RumblePitch"]?.value?.toFloatOrNull() ?: 0f

/**
 * Players RF Tire Sound rumblestrip pitch
 */
val IRacingData.Telemetry.TireRF_RumblePitch: Float
    get() = this.telemetry["TireRF_RumblePitch"]?.value?.toFloatOrNull() ?: 0f

/**
 * Players LR Tire Sound rumblestrip pitch
 */
val IRacingData.Telemetry.TireLR_RumblePitch: Float
    get() = this.telemetry["TireLR_RumblePitch"]?.value?.toFloatOrNull() ?: 0f

/**
 * Players LF Tire Sound rumblestrip pitch
 */
val IRacingData.Telemetry.TireLF_RumblePitch: Float
    get() = this.telemetry["TireLF_RumblePitch"]?.value?.toFloatOrNull() ?: 0f

/**
 * Raw throttle input 0=off throttle to 1=full throttle
 */
val IRacingData.Telemetry.ThrottleRaw: Float
    get() = this.telemetry["ThrottleRaw"]?.value?.toFloatOrNull() ?: 0f

/**
 * 0=off throttle to 1=full throttle
 */
val IRacingData.Telemetry.Throttle: Float
    get() = this.telemetry["Throttle"]?.value?.toFloatOrNull() ?: 0f

/**
 * True if steering wheel force is using linear mode
 */
val IRacingData.Telemetry.SteeringWheelUseLinear: Boolean
    get() = this.telemetry["SteeringWheelUseLinear"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * Output torque on steering shaft at 360 Hz
 */
val IRacingData.Telemetry.SteeringWheelTorque_ST: Float
    get() = this.telemetry["SteeringWheelTorque_ST"]?.value?.toFloatOrNull() ?: 0f

/**
 * Output torque on steering shaft
 */
val IRacingData.Telemetry.SteeringWheelTorque: Float
    get() = this.telemetry["SteeringWheelTorque"]?.value?.toFloatOrNull() ?: 0f

/**
 * Peak torque mapping to direct input units for FFB
 */
val IRacingData.Telemetry.SteeringWheelPeakForceNm: Float
    get() = this.telemetry["SteeringWheelPeakForceNm"]?.value?.toFloatOrNull() ?: 0f

/**
 * Force feedback % max torque on steering shaft signed stops
 */
val IRacingData.Telemetry.SteeringWheelPctTorqueSignStops: Float
    get() = this.telemetry["SteeringWheelPctTorqueSignStops"]?.value?.toFloatOrNull() ?: 0f

/**
 * Force feedback % max torque on steering shaft signed
 */
val IRacingData.Telemetry.SteeringWheelPctTorqueSign: Float
    get() = this.telemetry["SteeringWheelPctTorqueSign"]?.value?.toFloatOrNull() ?: 0f

/**
 * Force feedback % max torque on steering shaft unsigned
 */
val IRacingData.Telemetry.SteeringWheelPctTorque: Float
    get() = this.telemetry["SteeringWheelPctTorque"]?.value?.toFloatOrNull() ?: 0f

/**
 * Force feedback % max smoothing
 */
val IRacingData.Telemetry.SteeringWheelPctSmoothing: Float
    get() = this.telemetry["SteeringWheelPctSmoothing"]?.value?.toFloatOrNull() ?: 0f

/**
 * Force feedback % max damping
 */
val IRacingData.Telemetry.SteeringWheelPctDamper: Float
    get() = this.telemetry["SteeringWheelPctDamper"]?.value?.toFloatOrNull() ?: 0f

/**
 * Value of strength or max force slider in Nm for FFB
 */
val IRacingData.Telemetry.SteeringWheelMaxForceNm: Float
    get() = this.telemetry["SteeringWheelMaxForceNm"]?.value?.toFloatOrNull() ?: 0f

/**
 * Force feedback limiter strength limits impacts and oscillation
 */
val IRacingData.Telemetry.SteeringWheelLimiter: Float
    get() = this.telemetry["SteeringWheelLimiter"]?.value?.toFloatOrNull() ?: 0f

/**
 * Steering wheel max angle
 */
val IRacingData.Telemetry.SteeringWheelAngleMax: Float
    get() = this.telemetry["SteeringWheelAngleMax"]?.value?.toFloatOrNull() ?: 0f

/**
 * Steering wheel angle
 */
val IRacingData.Telemetry.SteeringWheelAngle: Float
    get() = this.telemetry["SteeringWheelAngle"]?.value?.toFloatOrNull() ?: 0f

/**
 * GPS vehicle speed
 */
val IRacingData.Telemetry.Speed: Float
    get() = this.telemetry["Speed"]?.value?.toFloatOrNull() ?: 0f

/**
 * Sun angle clockwise from north in radians
 */
val IRacingData.Telemetry.SolarAzimuth: Float
    get() = this.telemetry["SolarAzimuth"]?.value?.toFloatOrNull() ?: 0f

/**
 * Sun angle above horizon in radians
 */
val IRacingData.Telemetry.SolarAltitude: Float
    get() = this.telemetry["SolarAltitude"]?.value?.toFloatOrNull() ?: 0f

/**
 * Skies (0=clear/1=p cloudy/2=m cloudy/3=overcast)
 */
val IRacingData.Telemetry.Skies: Float
    get() = this.telemetry["Skies"]?.value?.toFloatOrNull() ?: 0f

/**
 * Friction torque applied to gears when shifting or grinding
 */
val IRacingData.Telemetry.ShiftPowerPct: Float
    get() = this.telemetry["ShiftPowerPct"]?.value?.toFloatOrNull() ?: 0f

/**
 * DEPRECATED use DriverCarSLBlinkRPM instead
 */
val IRacingData.Telemetry.ShiftIndicatorPct: Float
    get() = this.telemetry["ShiftIndicatorPct"]?.value?.toFloatOrNull() ?: 0f

/**
 * RPM of shifter grinding noise
 */
val IRacingData.Telemetry.ShiftGrindRPM: Float
    get() = this.telemetry["ShiftGrindRPM"]?.value?.toFloatOrNull() ?: 0f

/**
 * Session ID
 */
val IRacingData.Telemetry.SessionUniqueID: Float
    get() = this.telemetry["SessionUniqueID"]?.value?.toFloatOrNull() ?: 0f

/**
 * Total number of seconds in session
 */
val IRacingData.Telemetry.SessionTimeTotal: Float
    get() = this.telemetry["SessionTimeTotal"]?.value?.toFloatOrNull() ?: 0f

/**
 * Seconds left till session ends
 */
val IRacingData.Telemetry.SessionTimeRemain: Float
    get() = this.telemetry["SessionTimeRemain"]?.value?.toFloatOrNull() ?: 0f

/**
 * Time of day in seconds
 */
val IRacingData.Telemetry.SessionTimeOfDay: Float
    get() = this.telemetry["SessionTimeOfDay"]?.value?.toFloatOrNull() ?: 0f

/**
 * Seconds since session start
 */
val IRacingData.Telemetry.SessionTime: Float
    get() = this.telemetry["SessionTime"]?.value?.toFloatOrNull() ?: 0f

/**
 * Current update number
 */
val IRacingData.Telemetry.SessionTick: Float
    get() = this.telemetry["SessionTick"]?.value?.toFloatOrNull() ?: 0f

/**
 * Player is currently completing a joker lap
 */
val IRacingData.Telemetry.SessionOnJokerLap: Boolean
    get() = this.telemetry["SessionOnJokerLap"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * Session number
 */
val IRacingData.Telemetry.SessionNum: Float
    get() = this.telemetry["SessionNum"]?.value?.toFloatOrNull() ?: 0f

/**
 * Total number of laps in session
 */
val IRacingData.Telemetry.SessionLapsTotal: Float
    get() = this.telemetry["SessionLapsTotal"]?.value?.toFloatOrNull() ?: 0f

/**
 * New improved laps left till session ends
 */
val IRacingData.Telemetry.SessionLapsRemainEx: Float
    get() = this.telemetry["SessionLapsRemainEx"]?.value?.toFloatOrNull() ?: 0f

/**
 * Old laps left till session ends use SessionLapsRemainEx
 */
val IRacingData.Telemetry.SessionLapsRemain: Float
    get() = this.telemetry["SessionLapsRemain"]?.value?.toFloatOrNull() ?: 0f

/**
 * Joker laps remaining to be taken
 */
val IRacingData.Telemetry.SessionJokerLapsRemain: Float
    get() = this.telemetry["SessionJokerLapsRemain"]?.value?.toFloatOrNull() ?: 0f

/**
 * Roll rate at 360 Hz
 */
val IRacingData.Telemetry.RollRate_ST: Float
    get() = this.telemetry["RollRate_ST"]?.value?.toFloatOrNull() ?: 0f

/**
 * Roll rate
 */
val IRacingData.Telemetry.RollRate: Float
    get() = this.telemetry["RollRate"]?.value?.toFloatOrNull() ?: 0f

/**
 * Roll orientation
 */
val IRacingData.Telemetry.Roll: Float
    get() = this.telemetry["Roll"]?.value?.toFloatOrNull() ?: 0f

/**
 * How many right tire sets used so far
 */
val IRacingData.Telemetry.RightTireSetsUsed: Float
    get() = this.telemetry["RightTireSetsUsed"]?.value?.toFloatOrNull() ?: 0f

/**
 * How many right tire sets are remaining  255 is unlimited
 */
val IRacingData.Telemetry.RightTireSetsAvailable: Float
    get() = this.telemetry["RightTireSetsAvailable"]?.value?.toFloatOrNull() ?: 0f

/**
 * Seconds since replay session start
 */
val IRacingData.Telemetry.ReplaySessionTime: Float
    get() = this.telemetry["ReplaySessionTime"]?.value?.toFloatOrNull() ?: 0f

/**
 * Replay session number
 */
val IRacingData.Telemetry.ReplaySessionNum: Float
    get() = this.telemetry["ReplaySessionNum"]?.value?.toFloatOrNull() ?: 0f

/**
 * Replay playback speed
 */
val IRacingData.Telemetry.ReplayPlaySpeed: Float
    get() = this.telemetry["ReplayPlaySpeed"]?.value?.toFloatOrNull() ?: 0f

/**
 * 0=not slow motion  1=replay is in slow motion
 */
val IRacingData.Telemetry.ReplayPlaySlowMotion: Boolean
    get() = this.telemetry["ReplayPlaySlowMotion"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * Integer replay frame number from end of tape
 */
val IRacingData.Telemetry.ReplayFrameNumEnd: Float
    get() = this.telemetry["ReplayFrameNumEnd"]?.value?.toFloatOrNull() ?: 0f

/**
 * Integer replay frame number (60 per second)
 */
val IRacingData.Telemetry.ReplayFrameNum: Float
    get() = this.telemetry["ReplayFrameNum"]?.value?.toFloatOrNull() ?: 0f

/**
 * Relative Humidity
 */
val IRacingData.Telemetry.RelativeHumidity: Float
    get() = this.telemetry["RelativeHumidity"]?.value?.toFloatOrNull() ?: 0f

/**
 * How many rear tire sets used so far
 */
val IRacingData.Telemetry.RearTireSetsUsed: Float
    get() = this.telemetry["RearTireSetsUsed"]?.value?.toFloatOrNull() ?: 0f

/**
 * How many rear tire sets are remaining  255 is unlimited
 */
val IRacingData.Telemetry.RearTireSetsAvailable: Float
    get() = this.telemetry["RearTireSetsAvailable"]?.value?.toFloatOrNull() ?: 0f

/**
 * The radio index of the current person speaking on the radio
 */
val IRacingData.Telemetry.RadioTransmitRadioIdx: Float
    get() = this.telemetry["RadioTransmitRadioIdx"]?.value?.toFloatOrNull() ?: 0f

/**
 * The frequency index of the current person speaking on the radio
 */
val IRacingData.Telemetry.RadioTransmitFrequencyIdx: Float
    get() = this.telemetry["RadioTransmitFrequencyIdx"]?.value?.toFloatOrNull() ?: 0f

/**
 * The car index of the current person speaking on the radio
 */
val IRacingData.Telemetry.RadioTransmitCarIdx: String
    get() = this.telemetry["RadioTransmitCarIdx"]?.value.orEmpty()

/**
 * Laps completed in race
 */
val IRacingData.Telemetry.RaceLaps: Float
    get() = this.telemetry["RaceLaps"]?.value?.toFloatOrNull() ?: 0f

/**
 * RR tire right percent tread remaining
 */
val IRacingData.Telemetry.RRwearR: Float
    get() = this.telemetry["RRwearR"]?.value?.toFloatOrNull() ?: 0f

/**
 * RR tire middle percent tread remaining
 */
val IRacingData.Telemetry.RRwearM: Float
    get() = this.telemetry["RRwearM"]?.value?.toFloatOrNull() ?: 0f

/**
 * RR tire left percent tread remaining
 */
val IRacingData.Telemetry.RRwearL: Float
    get() = this.telemetry["RRwearL"]?.value?.toFloatOrNull() ?: 0f

/**
 * RR tire right carcass temperature
 */
val IRacingData.Telemetry.RRtempCR: Float
    get() = this.telemetry["RRtempCR"]?.value?.toFloatOrNull() ?: 1f

/**
 * RR tire middle carcass temperature
 */
val IRacingData.Telemetry.RRtempCM: Float
    get() = this.telemetry["RRtempCM"]?.value?.toFloatOrNull() ?: 1f

/**
 * RR tire left carcass temperature
 */
val IRacingData.Telemetry.RRtempCL: Float
    get() = this.telemetry["RRtempCL"]?.value?.toFloatOrNull() ?: 1f

/**
 * RR shock velocity at 360 Hz
 */
val IRacingData.Telemetry.RRshockVel_ST: Float
    get() = this.telemetry["RRshockVel_ST"]?.value?.toFloatOrNull() ?: 0f

/**
 * RR shock velocity
 */
val IRacingData.Telemetry.RRshockVel: Float
    get() = this.telemetry["RRshockVel"]?.value?.toFloatOrNull() ?: 0f

/**
 * RR shock deflection at 360 Hz
 */
val IRacingData.Telemetry.RRshockDefl_ST: Float
    get() = this.telemetry["RRshockDefl_ST"]?.value?.toFloatOrNull() ?: 0f

/**
 * RR shock deflection
 */
val IRacingData.Telemetry.RRshockDefl: Float
    get() = this.telemetry["RRshockDefl"]?.value?.toFloatOrNull() ?: 0f

/**
 * RR tire cold pressure  as set in the garage
 */
val IRacingData.Telemetry.RRcoldPressure: Float
    get() = this.telemetry["RRcoldPressure"]?.value?.toFloatOrNull() ?: 0f

/**
 * RR brake line pressure
 */
val IRacingData.Telemetry.RRbrakeLinePress: Float
    get() = this.telemetry["RRbrakeLinePress"]?.value?.toFloatOrNull() ?: 0f

/**
 * How many right rear tires used so far
 */
val IRacingData.Telemetry.RRTiresUsed: Float
    get() = this.telemetry["RRTiresUsed"]?.value?.toFloatOrNull() ?: 0f

/**
 * How many right rear tires are remaining  255 is unlimited
 */
val IRacingData.Telemetry.RRTiresAvailable: Float
    get() = this.telemetry["RRTiresAvailable"]?.value?.toFloatOrNull() ?: 0f

/**
 * Engine rpm
 */
val IRacingData.Telemetry.RPM: Float
    get() = this.telemetry["RPM"]?.value?.toFloatOrNull() ?: 0f

/**
 * RF tire right percent tread remaining
 */
val IRacingData.Telemetry.RFwearR: Float
    get() = this.telemetry["RFwearR"]?.value?.toFloatOrNull() ?: 0f

/**
 * RF tire middle percent tread remaining
 */
val IRacingData.Telemetry.RFwearM: Float
    get() = this.telemetry["RFwearM"]?.value?.toFloatOrNull() ?: 0f

/**
 * RF tire left percent tread remaining
 */
val IRacingData.Telemetry.RFwearL: Float
    get() = this.telemetry["RFwearL"]?.value?.toFloatOrNull() ?: 0f

/**
 * RF tire right carcass temperature
 */
val IRacingData.Telemetry.RFtempCR: Float
    get() = this.telemetry["RFtempCR"]?.value?.toFloatOrNull() ?: 1f

/**
 * RF tire middle carcass temperature
 */
val IRacingData.Telemetry.RFtempCM: Float
    get() = this.telemetry["RFtempCM"]?.value?.toFloatOrNull() ?: 1f

/**
 * RF tire left carcass temperature
 */
val IRacingData.Telemetry.RFtempCL: Float
    get() = this.telemetry["RFtempCL"]?.value?.toFloatOrNull() ?: 1f

/**
 * RF shock velocity at 360 Hz
 */
val IRacingData.Telemetry.RFshockVel_ST: Float
    get() = this.telemetry["RFshockVel_ST"]?.value?.toFloatOrNull() ?: 0f

/**
 * RF shock velocity
 */
val IRacingData.Telemetry.RFshockVel: Float
    get() = this.telemetry["RFshockVel"]?.value?.toFloatOrNull() ?: 0f

/**
 * RF shock deflection at 360 Hz
 */
val IRacingData.Telemetry.RFshockDefl_ST: Float
    get() = this.telemetry["RFshockDefl_ST"]?.value?.toFloatOrNull() ?: 0f

/**
 * RF shock deflection
 */
val IRacingData.Telemetry.RFshockDefl: Float
    get() = this.telemetry["RFshockDefl"]?.value?.toFloatOrNull() ?: 0f

/**
 * RF tire cold pressure  as set in the garage
 */
val IRacingData.Telemetry.RFcoldPressure: Float
    get() = this.telemetry["RFcoldPressure"]?.value?.toFloatOrNull() ?: 0f

/**
 * RF brake line pressure
 */
val IRacingData.Telemetry.RFbrakeLinePress: Float
    get() = this.telemetry["RFbrakeLinePress"]?.value?.toFloatOrNull() ?: 0f

/**
 * How many right front tires used so far
 */
val IRacingData.Telemetry.RFTiresUsed: Float
    get() = this.telemetry["RFTiresUsed"]?.value?.toFloatOrNull() ?: 0f

/**
 * How many right front tires are remaining  255 is unlimited
 */
val IRacingData.Telemetry.RFTiresAvailable: Float
    get() = this.telemetry["RFTiresAvailable"]?.value?.toFloatOrNull() ?: 0f

/**
 * Push to talk button state
 */
val IRacingData.Telemetry.PushToTalk: Boolean
    get() = this.telemetry["PushToTalk"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * Push to pass button state
 */
val IRacingData.Telemetry.PushToPass: Boolean
    get() = this.telemetry["PushToPass"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * Players car current tire compound
 */
val IRacingData.Telemetry.PlayerTireCompound: Float
    get() = this.telemetry["PlayerTireCompound"]?.value?.toFloatOrNull() ?: 0f

/**
 * Players car number of fast repairs used
 */
val IRacingData.Telemetry.PlayerFastRepairsUsed: Float
    get() = this.telemetry["PlayerFastRepairsUsed"]?.value?.toFloatOrNull() ?: 0f

/**
 * Players weight penalty
 */
val IRacingData.Telemetry.PlayerCarWeightPenalty: Float
    get() = this.telemetry["PlayerCarWeightPenalty"]?.value?.toFloatOrNull() ?: 0f

/**
 * Players car is being towed if time is greater than zero
 */
val IRacingData.Telemetry.PlayerCarTowTime: Float
    get() = this.telemetry["PlayerCarTowTime"]?.value?.toFloatOrNull() ?: 0f

/**
 * Players team incident count for this session
 */
val IRacingData.Telemetry.PlayerCarTeamIncidentCount: Float
    get() = this.telemetry["PlayerCarTeamIncidentCount"]?.value?.toFloatOrNull() ?: 0f

/**
 * Players power adjust
 */
val IRacingData.Telemetry.PlayerCarPowerAdjust: Float
    get() = this.telemetry["PlayerCarPowerAdjust"]?.value?.toFloatOrNull() ?: 0f

/**
 * Players position in race
 */
val IRacingData.Telemetry.PlayerCarPosition: Float
    get() = this.telemetry["PlayerCarPosition"]?.value?.toFloatOrNull() ?: 0f

/**
 * Players own incident count for this session
 */
val IRacingData.Telemetry.PlayerCarMyIncidentCount: Float
    get() = this.telemetry["PlayerCarMyIncidentCount"]?.value?.toFloatOrNull() ?: 0f

/**
 * Players car is properly in there pitstall
 */
val IRacingData.Telemetry.PlayerCarInPitStall: Boolean
    get() = this.telemetry["PlayerCarInPitStall"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * Players carIdx
 */
val IRacingData.Telemetry.PlayerCarIdx: Int
    get() = this.telemetry["PlayerCarIdx"]?.value?.toIntOrNull() ?: 0

/**
 * Players dry tire set limit
 */
val IRacingData.Telemetry.PlayerCarDryTireSetLimit: Float
    get() = this.telemetry["PlayerCarDryTireSetLimit"]?.value?.toFloatOrNull() ?: 0f

/**
 * Teams current drivers incident count for this session
 */
val IRacingData.Telemetry.PlayerCarDriverIncidentCount: Float
    get() = this.telemetry["PlayerCarDriverIncidentCount"]?.value?.toFloatOrNull() ?: 0f

/**
 * Players class position in race
 */
val IRacingData.Telemetry.PlayerCarClassPosition: Float
    get() = this.telemetry["PlayerCarClassPosition"]?.value?.toFloatOrNull() ?: 0f

/**
 * Player car class id
 */
val IRacingData.Telemetry.PlayerCarClass: Float
    get() = this.telemetry["PlayerCarClass"]?.value?.toFloatOrNull() ?: 0f

/**
 * Is the player getting pit stop service
 */
val IRacingData.Telemetry.PitstopActive: Boolean
    get() = this.telemetry["PitstopActive"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * True if pit stop is allowed for the current player
 */
val IRacingData.Telemetry.PitsOpen: Boolean
    get() = this.telemetry["PitsOpen"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * Pitch rate at 360 Hz
 */
val IRacingData.Telemetry.PitchRate_ST: Float
    get() = this.telemetry["PitchRate_ST"]?.value?.toFloatOrNull() ?: 0f

/**
 * Pitch rate
 */
val IRacingData.Telemetry.PitchRate: Float
    get() = this.telemetry["PitchRate"]?.value?.toFloatOrNull() ?: 0f

/**
 * Pitch orientation
 */
val IRacingData.Telemetry.Pitch: Float
    get() = this.telemetry["Pitch"]?.value?.toFloatOrNull() ?: 0f

/**
 * Pit service pending tire compound
 */
val IRacingData.Telemetry.PitSvTireCompound: Float
    get() = this.telemetry["PitSvTireCompound"]?.value?.toFloatOrNull() ?: 0f

/**
 * Pit service right rear tire pressure
 */
val IRacingData.Telemetry.PitSvRRP: Float
    get() = this.telemetry["PitSvRRP"]?.value?.toFloatOrNull() ?: 0f

/**
 * Pit service right front tire pressure
 */
val IRacingData.Telemetry.PitSvRFP: Float
    get() = this.telemetry["PitSvRFP"]?.value?.toFloatOrNull() ?: 0f

/**
 * Pit service left rear tire pressure
 */
val IRacingData.Telemetry.PitSvLRP: Float
    get() = this.telemetry["PitSvLRP"]?.value?.toFloatOrNull() ?: 0f

/**
 * Pit service left front tire pressure
 */
val IRacingData.Telemetry.PitSvLFP: Float
    get() = this.telemetry["PitSvLFP"]?.value?.toFloatOrNull() ?: 0f

/**
 * Pit service fuel add amount
 */
val IRacingData.Telemetry.PitSvFuel: Float
    get() = this.telemetry["PitSvFuel"]?.value?.toFloatOrNull() ?: 0f

/**
 * Time left for mandatory pit repairs if repairs are active
 */
val IRacingData.Telemetry.PitRepairLeft: Float
    get() = this.telemetry["PitRepairLeft"]?.value?.toFloatOrNull() ?: 0f

/**
 * Time left for optional repairs if repairs are active
 */
val IRacingData.Telemetry.PitOptRepairLeft: Float
    get() = this.telemetry["PitOptRepairLeft"]?.value?.toFloatOrNull() ?: 0f

/**
 * Is the player car on pit road between the cones
 */
val IRacingData.Telemetry.OnPitRoad: Boolean
    get() = this.telemetry["OnPitRoad"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * True if it is ok to reload car textures at this time
 */
val IRacingData.Telemetry.OkToReloadTextures: Boolean
    get() = this.telemetry["OkToReloadTextures"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * Engine oil temperature
 */
val IRacingData.Telemetry.OilTemp: Float
    get() = this.telemetry["OilTemp"]?.value?.toFloatOrNull() ?: 0f

/**
 * Engine oil pressure
 */
val IRacingData.Telemetry.OilPress: Float
    get() = this.telemetry["OilPress"]?.value?.toFloatOrNull() ?: 0f

/**
 * Engine oil level
 */
val IRacingData.Telemetry.OilLevel: Float
    get() = this.telemetry["OilLevel"]?.value?.toFloatOrNull() ?: 0f

/**
 * Memory soft page faults per second
 */
val IRacingData.Telemetry.MemSoftPageFaultSec: Float
    get() = this.telemetry["MemSoftPageFaultSec"]?.value?.toFloatOrNull() ?: 0f

/**
 * Memory page faults per second
 */
val IRacingData.Telemetry.MemPageFaultSec: Float
    get() = this.telemetry["MemPageFaultSec"]?.value?.toFloatOrNull() ?: 0f

/**
 * Hybrid manual no boost state
 */
val IRacingData.Telemetry.ManualNoBoost: Boolean
    get() = this.telemetry["ManualNoBoost"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * Hybrid manual boost state
 */
val IRacingData.Telemetry.ManualBoost: Boolean
    get() = this.telemetry["ManualBoost"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * Engine manifold pressure
 */
val IRacingData.Telemetry.ManifoldPress: Float
    get() = this.telemetry["ManifoldPress"]?.value?.toFloatOrNull() ?: 0f

/**
 * Longitudinal acceleration (including gravity) at 360 Hz
 */
val IRacingData.Telemetry.LongAccel_ST: Float
    get() = this.telemetry["LongAccel_ST"]?.value?.toFloatOrNull() ?: 0f

/**
 * Longitudinal acceleration (including gravity)
 */
val IRacingData.Telemetry.LongAccel: Float
    get() = this.telemetry["LongAccel"]?.value?.toFloatOrNull() ?: 0f

/**
 * True if the car_num texture will be loaded
 */
val IRacingData.Telemetry.LoadNumTextures: Boolean
    get() = this.telemetry["LoadNumTextures"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * How many left tire sets used so far
 */
val IRacingData.Telemetry.LeftTireSetsUsed: Float
    get() = this.telemetry["LeftTireSetsUsed"]?.value?.toFloatOrNull() ?: 0f

/**
 * How many left tire sets are remaining  255 is unlimited
 */
val IRacingData.Telemetry.LeftTireSetsAvailable: Float
    get() = this.telemetry["LeftTireSetsAvailable"]?.value?.toFloatOrNull() ?: 0f

/**
 * Lateral acceleration (including gravity) at 360 Hz
 */
val IRacingData.Telemetry.LatAccel_ST: Float
    get() = this.telemetry["LatAccel_ST"]?.value?.toFloatOrNull() ?: 0f

/**
 * Lateral acceleration (including gravity)
 */
val IRacingData.Telemetry.LatAccel: Float
    get() = this.telemetry["LatAccel"]?.value?.toFloatOrNull() ?: 0f

/**
 * Player last N average lap time
 */
val IRacingData.Telemetry.LapLastNLapTime: Float
    get() = this.telemetry["LapLastNLapTime"]?.value?.toFloatOrNull() ?: 0f

/**
 * Players last lap time
 */
val IRacingData.Telemetry.LapLastLapTime: Float
    get() = this.telemetry["LapLastLapTime"]?.value?.toFloatOrNull() ?: 0f

/**
 * Player num consecutive clean laps completed for N average
 */
val IRacingData.Telemetry.LapLasNLapSeq: Float
    get() = this.telemetry["LapLasNLapSeq"]?.value?.toFloatOrNull() ?: 0f

/**
 * Percentage distance around lap
 */
val IRacingData.Telemetry.LapDistPct: Float
    get() = this.telemetry["LapDistPct"]?.value?.toFloatOrNull() ?: 0f

/**
 * Meters traveled from S/F this lap
 */
val IRacingData.Telemetry.LapDist: Float
    get() = this.telemetry["LapDist"]?.value?.toFloatOrNull() ?: 0f

/**
 * Delta time for session optimal lap is valid
 */
val IRacingData.Telemetry.LapDeltaToSessionOptimalLap_OK: Boolean
    get() = this.telemetry["LapDeltaToSessionOptimalLap_OK"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * Rate of change of delta time for session optimal lap
 */
val IRacingData.Telemetry.LapDeltaToSessionOptimalLap_DD: Float
    get() = this.telemetry["LapDeltaToSessionOptimalLap_DD"]?.value?.toFloatOrNull() ?: 0f

/**
 * Delta time for session optimal lap
 */
val IRacingData.Telemetry.LapDeltaToSessionOptimalLap: Float
    get() = this.telemetry["LapDeltaToSessionOptimalLap"]?.value?.toFloatOrNull() ?: 0f

/**
 * Delta time for session last lap is valid
 */
val IRacingData.Telemetry.LapDeltaToSessionLastlLap_OK: Boolean
    get() = this.telemetry["LapDeltaToSessionLastlLap_OK"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * Rate of change of delta time for session last lap
 */
val IRacingData.Telemetry.LapDeltaToSessionLastlLap_DD: Float
    get() = this.telemetry["LapDeltaToSessionLastlLap_DD"]?.value?.toFloatOrNull() ?: 0f

/**
 * Delta time for session last lap
 */
val IRacingData.Telemetry.LapDeltaToSessionLastlLap: Float
    get() = this.telemetry["LapDeltaToSessionLastlLap"]?.value?.toFloatOrNull() ?: 0f

/**
 * Delta time for session best lap is valid
 */
val IRacingData.Telemetry.LapDeltaToSessionBestLap_OK: Boolean
    get() = this.telemetry["LapDeltaToSessionBestLap_OK"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * Rate of change of delta time for session best lap
 */
val IRacingData.Telemetry.LapDeltaToSessionBestLap_DD: Float
    get() = this.telemetry["LapDeltaToSessionBestLap_DD"]?.value?.toFloatOrNull() ?: 0f

/**
 * Delta time for session best lap
 */
val IRacingData.Telemetry.LapDeltaToSessionBestLap: Float
    get() = this.telemetry["LapDeltaToSessionBestLap"]?.value?.toFloatOrNull() ?: 0f

/**
 * Delta time for optimal lap is valid
 */
val IRacingData.Telemetry.LapDeltaToOptimalLap_OK: Boolean
    get() = this.telemetry["LapDeltaToOptimalLap_OK"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * Rate of change of delta time for optimal lap
 */
val IRacingData.Telemetry.LapDeltaToOptimalLap_DD: Float
    get() = this.telemetry["LapDeltaToOptimalLap_DD"]?.value?.toFloatOrNull() ?: 0f

/**
 * Delta time for optimal lap
 */
val IRacingData.Telemetry.LapDeltaToOptimalLap: Float
    get() = this.telemetry["LapDeltaToOptimalLap"]?.value?.toFloatOrNull() ?: 0f

/**
 * Delta time for best lap is valid
 */
val IRacingData.Telemetry.LapDeltaToBestLap_OK: Boolean
    get() = this.telemetry["LapDeltaToBestLap_OK"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * Rate of change of delta time for best lap
 */
val IRacingData.Telemetry.LapDeltaToBestLap_DD: Float
    get() = this.telemetry["LapDeltaToBestLap_DD"]?.value?.toFloatOrNull() ?: 0f

/**
 * Delta time for best lap
 */
val IRacingData.Telemetry.LapDeltaToBestLap: Float
    get() = this.telemetry["LapDeltaToBestLap"]?.value?.toFloatOrNull() ?: 0f

/**
 * Estimate of players current lap time as shown in F3 box
 */
val IRacingData.Telemetry.LapCurrentLapTime: Float
    get() = this.telemetry["LapCurrentLapTime"]?.value?.toFloatOrNull() ?: 0f

/**
 * Laps completed count
 */
val IRacingData.Telemetry.LapCompleted: Float
    get() = this.telemetry["LapCompleted"]?.value?.toFloatOrNull() ?: 0f

/**
 * Player best N average lap time
 */
val IRacingData.Telemetry.LapBestNLapTime: Float
    get() = this.telemetry["LapBestNLapTime"]?.value?.toFloatOrNull() ?: 0f

/**
 * Player last lap in best N average lap time
 */
val IRacingData.Telemetry.LapBestNLapLap: Float
    get() = this.telemetry["LapBestNLapLap"]?.value?.toFloatOrNull() ?: 0f

/**
 * Players best lap time
 */
val IRacingData.Telemetry.LapBestLapTime: Float
    get() = this.telemetry["LapBestLapTime"]?.value?.toFloatOrNull() ?: 0f

/**
 * Players best lap number
 */
val IRacingData.Telemetry.LapBestLap: Float
    get() = this.telemetry["LapBestLap"]?.value?.toFloatOrNull() ?: 0f

/**
 * Laps started count
 */
val IRacingData.Telemetry.Lap: Float
    get() = this.telemetry["Lap"]?.value?.toFloatOrNull() ?: 0f

/**
 * LR tire right percent tread remaining
 */
val IRacingData.Telemetry.LRwearR: Float
    get() = this.telemetry["LRwearR"]?.value?.toFloatOrNull() ?: 0f

/**
 * LR tire middle percent tread remaining
 */
val IRacingData.Telemetry.LRwearM: Float
    get() = this.telemetry["LRwearM"]?.value?.toFloatOrNull() ?: 0f

/**
 * LR tire left percent tread remaining
 */
val IRacingData.Telemetry.LRwearL: Float
    get() = this.telemetry["LRwearL"]?.value?.toFloatOrNull() ?: 0f

/**
 * LR tire right carcass temperature
 */
val IRacingData.Telemetry.LRtempCR: Float
    get() = this.telemetry["LRtempCR"]?.value?.toFloatOrNull() ?: 1f

/**
 * LR tire middle carcass temperature
 */
val IRacingData.Telemetry.LRtempCM: Float
    get() = this.telemetry["LRtempCM"]?.value?.toFloatOrNull() ?: 1f

/**
 * LR tire left carcass temperature
 */
val IRacingData.Telemetry.LRtempCL: Float
    get() = this.telemetry["LRtempCL"]?.value?.toFloatOrNull() ?: 1f

/**
 * LR shock velocity at 360 Hz
 */
val IRacingData.Telemetry.LRshockVel_ST: Float
    get() = this.telemetry["LRshockVel_ST"]?.value?.toFloatOrNull() ?: 0f

/**
 * LR shock velocity
 */
val IRacingData.Telemetry.LRshockVel: Float
    get() = this.telemetry["LRshockVel"]?.value?.toFloatOrNull() ?: 0f

/**
 * LR shock deflection at 360 Hz
 */
val IRacingData.Telemetry.LRshockDefl_ST: Float
    get() = this.telemetry["LRshockDefl_ST"]?.value?.toFloatOrNull() ?: 0f

/**
 * LR shock deflection
 */
val IRacingData.Telemetry.LRshockDefl: Float
    get() = this.telemetry["LRshockDefl"]?.value?.toFloatOrNull() ?: 0f

/**
 * LR tire cold pressure  as set in the garage
 */
val IRacingData.Telemetry.LRcoldPressure: Float
    get() = this.telemetry["LRcoldPressure"]?.value?.toFloatOrNull() ?: 0f

/**
 * LR brake line pressure
 */
val IRacingData.Telemetry.LRbrakeLinePress: Float
    get() = this.telemetry["LRbrakeLinePress"]?.value?.toFloatOrNull() ?: 0f

/**
 * How many left rear tires used so far
 */
val IRacingData.Telemetry.LRTiresUsed: Float
    get() = this.telemetry["LRTiresUsed"]?.value?.toFloatOrNull() ?: 0f

/**
 * How many left rear tires are remaining  255 is unlimited
 */
val IRacingData.Telemetry.LRTiresAvailable: Float
    get() = this.telemetry["LRTiresAvailable"]?.value?.toFloatOrNull() ?: 0f

/**
 * LF tire right percent tread remaining
 */
val IRacingData.Telemetry.LFwearR: Float
    get() = this.telemetry["LFwearR"]?.value?.toFloatOrNull() ?: 0f

/**
 * LF tire middle percent tread remaining
 */
val IRacingData.Telemetry.LFwearM: Float
    get() = this.telemetry["LFwearM"]?.value?.toFloatOrNull() ?: 0f

/**
 * LF tire left percent tread remaining
 */
val IRacingData.Telemetry.LFwearL: Float
    get() = this.telemetry["LFwearL"]?.value?.toFloatOrNull() ?: 0f

/**
 * LF tire right carcass temperature
 */
val IRacingData.Telemetry.LFtempCR: Float
    get() = this.telemetry["LFtempCR"]?.value?.toFloatOrNull() ?: 1f

/**
 * LF tire middle carcass temperature
 */
val IRacingData.Telemetry.LFtempCM: Float
    get() = this.telemetry["LFtempCM"]?.value?.toFloatOrNull() ?: 1f

/**
 * LF tire left carcass temperature
 */
val IRacingData.Telemetry.LFtempCL: Float
    get() = this.telemetry["LFtempCL"]?.value?.toFloatOrNull() ?: 1f

/**
 * LF shock velocity at 360 Hz
 */
val IRacingData.Telemetry.LFshockVel_ST: Float
    get() = this.telemetry["LFshockVel_ST"]?.value?.toFloatOrNull() ?: 0f

/**
 * LF shock velocity
 */
val IRacingData.Telemetry.LFshockVel: Float
    get() = this.telemetry["LFshockVel"]?.value?.toFloatOrNull() ?: 0f

/**
 * LF shock deflection at 360 Hz
 */
val IRacingData.Telemetry.LFshockDefl_ST: Float
    get() = this.telemetry["LFshockDefl_ST"]?.value?.toFloatOrNull() ?: 0f

/**
 * LF shock deflection
 */
val IRacingData.Telemetry.LFshockDefl: Float
    get() = this.telemetry["LFshockDefl"]?.value?.toFloatOrNull() ?: 0f

/**
 * LF tire cold pressure  as set in the garage
 */
val IRacingData.Telemetry.LFcoldPressure: Float
    get() = this.telemetry["LFcoldPressure"]?.value?.toFloatOrNull() ?: 0f

/**
 * LF brake line pressure
 */
val IRacingData.Telemetry.LFbrakeLinePress: Float
    get() = this.telemetry["LFbrakeLinePress"]?.value?.toFloatOrNull() ?: 0f

/**
 * How many left front tires used so far
 */
val IRacingData.Telemetry.LFTiresUsed: Float
    get() = this.telemetry["LFTiresUsed"]?.value?.toFloatOrNull() ?: 0f

/**
 * How many left front tires are remaining  255 is unlimited
 */
val IRacingData.Telemetry.LFTiresAvailable: Float
    get() = this.telemetry["LFTiresAvailable"]?.value?.toFloatOrNull() ?: 0f

/**
 * 0=replay not playing  1=replay playing
 */
val IRacingData.Telemetry.IsReplayPlaying: Boolean
    get() = this.telemetry["IsReplayPlaying"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * 1=Car on track physics running
 */
val IRacingData.Telemetry.IsOnTrackCar: Boolean
    get() = this.telemetry["IsOnTrackCar"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * 1=Car on track physics running with player in car
 */
val IRacingData.Telemetry.IsOnTrack: Boolean
    get() = this.telemetry["IsOnTrack"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * 1=Car in garage physics running
 */
val IRacingData.Telemetry.IsInGarage: Boolean
    get() = this.telemetry["IsInGarage"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * 1=Garage screen is visible
 */
val IRacingData.Telemetry.IsGarageVisible: Boolean
    get() = this.telemetry["IsGarageVisible"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * 0=disk based telemetry turned off  1=turned on
 */
val IRacingData.Telemetry.IsDiskLoggingEnabled: Boolean
    get() = this.telemetry["IsDiskLoggingEnabled"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * 0=disk based telemetry file not being written  1=being written
 */
val IRacingData.Telemetry.IsDiskLoggingActive: Boolean
    get() = this.telemetry["IsDiskLoggingActive"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * Raw handbrake input 0=handbrake released to 1=max force
 */
val IRacingData.Telemetry.HandbrakeRaw: Float
    get() = this.telemetry["HandbrakeRaw"]?.value?.toFloatOrNull() ?: 0f

/**
 * Percent of available tim gpu took with a 1 sec avg
 */
val IRacingData.Telemetry.GpuUsage: Float
    get() = this.telemetry["GpuUsage"]?.value?.toFloatOrNull() ?: 0f

/**
 * -1=reverse  0=neutral  1..n=current gear
 */
val IRacingData.Telemetry.Gear: Float
    get() = this.telemetry["Gear"]?.value?.toFloatOrNull() ?: 0f

/**
 * Engine fuel used instantaneous
 */
val IRacingData.Telemetry.FuelUsePerHour: Float
    get() = this.telemetry["FuelUsePerHour"]?.value?.toFloatOrNull() ?: 0f

/**
 * Engine fuel pressure
 */
val IRacingData.Telemetry.FuelPress: Float
    get() = this.telemetry["FuelPress"]?.value?.toFloatOrNull() ?: 0f

/**
 * Percent fuel remaining
 */
val IRacingData.Telemetry.FuelLevelPct: Float
    get() = this.telemetry["FuelLevelPct"]?.value?.toFloatOrNull() ?: 0f

/**
 * Liters of fuel remaining
 */
val IRacingData.Telemetry.FuelLevel: Float
    get() = this.telemetry["FuelLevel"]?.value?.toFloatOrNull() ?: 0f

/**
 * How many front tire sets used so far
 */
val IRacingData.Telemetry.FrontTireSetsUsed: Float
    get() = this.telemetry["FrontTireSetsUsed"]?.value?.toFloatOrNull() ?: 0f

/**
 * How many front tire sets are remaining  255 is unlimited
 */
val IRacingData.Telemetry.FrontTireSetsAvailable: Float
    get() = this.telemetry["FrontTireSetsAvailable"]?.value?.toFloatOrNull() ?: 0f

/**
 * Average frames per second
 */
val IRacingData.Telemetry.FrameRate: Float
    get() = this.telemetry["FrameRate"]?.value?.toFloatOrNull() ?: 0f

/**
 * Fog level
 */
val IRacingData.Telemetry.FogLevel: Float
    get() = this.telemetry["FogLevel"]?.value?.toFloatOrNull() ?: 0f

/**
 * How many fast repairs used so far
 */
val IRacingData.Telemetry.FastRepairUsed: Float
    get() = this.telemetry["FastRepairUsed"]?.value?.toFloatOrNull() ?: 0f

/**
 * How many fast repairs left  255 is unlimited
 */
val IRacingData.Telemetry.FastRepairAvailable: Float
    get() = this.telemetry["FastRepairAvailable"]?.value?.toFloatOrNull() ?: 0f

/**
 * Indicate action the reset key will take 0 enter 1 exit 2 reset
 */
val IRacingData.Telemetry.EnterExitReset: Float
    get() = this.telemetry["EnterExitReset"]?.value?.toFloatOrNull() ?: 0f

/**
 * Engine0Engine rpm
 */
val IRacingData.Telemetry.Engine0_RPM: Float
    get() = this.telemetry["Engine0_RPM"]?.value?.toFloatOrNull() ?: 0f

/**
 * Driver activated flag
 */
val IRacingData.Telemetry.DriverMarker: Boolean
    get() = this.telemetry["DriverMarker"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * Default units for the user interface 0 = english 1 = metric
 */
val IRacingData.Telemetry.DisplayUnits: Float
    get() = this.telemetry["DisplayUnits"]?.value?.toFloatOrNull() ?: 0f

/**
 * Status of driver change lap requirements
 */
val IRacingData.Telemetry.DCLapStatus: Float
    get() = this.telemetry["DCLapStatus"]?.value?.toFloatOrNull() ?: 0f

/**
 * Number of team drivers who have run a stint
 */
val IRacingData.Telemetry.DCDriversSoFar: Float
    get() = this.telemetry["DCDriversSoFar"]?.value?.toFloatOrNull() ?: 0f

/**
 * Percent of available tim fg thread took with a 1 sec avg
 */
val IRacingData.Telemetry.CpuUsageFG: Float
    get() = this.telemetry["CpuUsageFG"]?.value?.toFloatOrNull() ?: 0f

/**
 * Percent of available tim bg thread took with a 1 sec avg
 */
val IRacingData.Telemetry.CpuUsageBG: Float
    get() = this.telemetry["CpuUsageBG"]?.value?.toFloatOrNull() ?: 0f

/**
 * Raw clutch input 0=disengaged to 1=fully engaged
 */
val IRacingData.Telemetry.ClutchRaw: Float
    get() = this.telemetry["ClutchRaw"]?.value?.toFloatOrNull() ?: 0f

/**
 * 0=disengaged to 1=fully engaged
 */
val IRacingData.Telemetry.Clutch: Float
    get() = this.telemetry["Clutch"]?.value?.toFloatOrNull() ?: 0f

/**
 * Communications quality
 */
val IRacingData.Telemetry.ChanQuality: Float
    get() = this.telemetry["ChanQuality"]?.value?.toFloatOrNull() ?: 0f

/**
 * Partner communications quality
 */
val IRacingData.Telemetry.ChanPartnerQuality: Float
    get() = this.telemetry["ChanPartnerQuality"]?.value?.toFloatOrNull() ?: 0f

/**
 * Communications latency
 */
val IRacingData.Telemetry.ChanLatency: Float
    get() = this.telemetry["ChanLatency"]?.value?.toFloatOrNull() ?: 0f

/**
 * Communications server clock skew
 */
val IRacingData.Telemetry.ChanClockSkew: Float
    get() = this.telemetry["ChanClockSkew"]?.value?.toFloatOrNull() ?: 0f

/**
 * Communications average latency
 */
val IRacingData.Telemetry.ChanAvgLatency: Float
    get() = this.telemetry["ChanAvgLatency"]?.value?.toFloatOrNull() ?: 0f

/**
 * Cars current tire compound
 */
val IRacingData.Telemetry.CarIdxTireCompound: String
    get() = this.telemetry["CarIdxTireCompound"]?.value.orEmpty()

/**
 * Steering wheel angle by car index
 */
val IRacingData.Telemetry.CarIdxSteer: String
    get() = this.telemetry["CarIdxSteer"]?.value.orEmpty()

/**
 * Engine rpm by car index
 */
val IRacingData.Telemetry.CarIdxRPM: String
    get() = this.telemetry["CarIdxRPM"]?.value.orEmpty()

/**
 * Cars Qual tire compound is locked-in
 */
val IRacingData.Telemetry.CarIdxQualTireCompoundLocked: String
    get() = this.telemetry["CarIdxQualTireCompoundLocked"]?.value.orEmpty()

/**
 * Cars Qual tire compound
 */
val IRacingData.Telemetry.CarIdxQualTireCompound: String
    get() = this.telemetry["CarIdxQualTireCompound"]?.value.orEmpty()

/**
 * Cars position in race by car index
 */
val IRacingData.Telemetry.CarIdxPosition: String
    get() = this.telemetry["CarIdxPosition"]?.value.orEmpty()

/**
 * What row cars are pacing in  or -1 if not pacing
 */
val IRacingData.Telemetry.CarIdxPaceRow: String
    get() = this.telemetry["CarIdxPaceRow"]?.value.orEmpty()

/**
 * What line cars are pacing in  or -1 if not pacing
 */
val IRacingData.Telemetry.CarIdxPaceLine: String
    get() = this.telemetry["CarIdxPaceLine"]?.value.orEmpty()

/**
 * Push2Pass active or not
 */
val IRacingData.Telemetry.CarIdxP2P_Status: String
    get() = this.telemetry["CarIdxP2P_Status"]?.value.orEmpty()

/**
 * Push2Pass count of usage (or remaining in Race)
 */
val IRacingData.Telemetry.CarIdxP2P_Count: String
    get() = this.telemetry["CarIdxP2P_Count"]?.value.orEmpty()

/**
 * On pit road between the cones by car index
 */
val IRacingData.Telemetry.CarIdxOnPitRoad: String
    get() = this.telemetry["CarIdxOnPitRoad"]?.value.orEmpty()

/**
 * Cars last lap time
 */
val IRacingData.Telemetry.CarIdxLastLapTime: String
    get() = this.telemetry["CarIdxLastLapTime"]?.value.orEmpty()

/**
 * Percentage distance around lap by car index
 */
val IRacingData.Telemetry.CarIdxLapDistPct: String
    get() = this.telemetry["CarIdxLapDistPct"]?.value.orEmpty()

/**
 * Laps completed by car index
 */
val IRacingData.Telemetry.CarIdxLapCompleted: String
    get() = this.telemetry["CarIdxLapCompleted"]?.value.orEmpty()

/**
 * Laps started by car index
 */
val IRacingData.Telemetry.CarIdxLap: String
    get() = this.telemetry["CarIdxLap"]?.value.orEmpty()

/**
 * -1=reverse  0=neutral  1..n=current gear by car index
 */
val IRacingData.Telemetry.CarIdxGear: String
    get() = this.telemetry["CarIdxGear"]?.value.orEmpty()

/**
 * How many fast repairs each car has used
 */
val IRacingData.Telemetry.CarIdxFastRepairsUsed: String
    get() = this.telemetry["CarIdxFastRepairsUsed"]?.value.orEmpty()

/**
 * Race time behind leader or fastest lap time otherwise
 */
val IRacingData.Telemetry.CarIdxF2Time: String
    get() = this.telemetry["CarIdxF2Time"]?.value.orEmpty()

/**
 * Estimated time to reach current location on track
 */
val IRacingData.Telemetry.CarIdxEstTime: String
    get() = this.telemetry["CarIdxEstTime"]?.value.orEmpty()

/**
 * Cars class position in race by car index
 */
val IRacingData.Telemetry.CarIdxClassPosition: String
    get() = this.telemetry["CarIdxClassPosition"]?.value.orEmpty()

/**
 * Cars class id by car index
 */
val IRacingData.Telemetry.CarIdxClass: String
    get() = this.telemetry["CarIdxClass"]?.value.orEmpty()

/**
 * Cars best lap time
 */
val IRacingData.Telemetry.CarIdxBestLapTime: String
    get() = this.telemetry["CarIdxBestLapTime"]?.value.orEmpty()

/**
 * Cars best lap number
 */
val IRacingData.Telemetry.CarIdxBestLapNum: String
    get() = this.telemetry["CarIdxBestLapNum"]?.value.orEmpty()

/**
 * Active camera group number
 */
val IRacingData.Telemetry.CamGroupNumber: Float
    get() = this.telemetry["CamGroupNumber"]?.value?.toFloatOrNull() ?: 0f

/**
 * Active camera's focus car index
 */
val IRacingData.Telemetry.CamCarIdx: Float
    get() = this.telemetry["CamCarIdx"]?.value?.toFloatOrNull() ?: 0f

/**
 * Active camera number
 */
val IRacingData.Telemetry.CamCameraNumber: Float
    get() = this.telemetry["CamCameraNumber"]?.value?.toFloatOrNull() ?: 0f

/**
 * Raw brake input 0=brake released to 1=max pedal force
 */
val IRacingData.Telemetry.BrakeRaw: Float
    get() = this.telemetry["BrakeRaw"]?.value?.toFloatOrNull() ?: 0f

/**
 * true if abs is currently reducing brake force pressure
 */
val IRacingData.Telemetry.BrakeABSactive: Boolean
    get() = this.telemetry["BrakeABSactive"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * 0=brake released to 1=max pedal force
 */
val IRacingData.Telemetry.Brake: Float
    get() = this.telemetry["Brake"]?.value?.toFloatOrNull() ?: 0f

/**
 * Temperature of air at start/finish line
 */
val IRacingData.Telemetry.AirTemp: Float
    get() = this.telemetry["AirTemp"]?.value?.toFloatOrNull() ?: 0f

/**
 * Pressure of air at start/finish line
 */
val IRacingData.Telemetry.AirPressure: Float
    get() = this.telemetry["AirPressure"]?.value?.toFloatOrNull() ?: 0f

/**
 * Density of air at start/finish line
 */
val IRacingData.Telemetry.AirDensity: Float
    get() = this.telemetry["AirDensity"]?.value?.toFloatOrNull() ?: 0f

/**
 * Pitstop auto fill fuel system enabled
 */
val IRacingData.Telemetry.dpFuelAutoFillEnabled: Float
    get() = this.telemetry["dpFuelAutoFillEnabled"]?.value?.toFloatOrNull() ?: 0f

/**
 * Pitstop auto fill fuel next stop flag
 */
val IRacingData.Telemetry.dpFuelAutoFillActive: Float
    get() = this.telemetry["dpFuelAutoFillActive"]?.value?.toFloatOrNull() ?: 0f

/**
 * In car traction control active
 */
val IRacingData.Telemetry.dcTractionControlToggle: Boolean
    get() = this.telemetry["dcTractionControlToggle"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * In car traction control adjustment
 */
val IRacingData.Telemetry.dcTractionControl: Float
    get() = this.telemetry["dcTractionControl"]?.value?.toFloatOrNull() ?: 0f

/**
 * In car abs adjustment
 */
val IRacingData.Telemetry.dcABS: Float
    get() = this.telemetry["dcABS"]?.value?.toFloatOrNull() ?: 0f

/**
 * In car momentarily turn on wipers
 */
val IRacingData.Telemetry.dcTriggerWindshieldWipers: Boolean
    get() = this.telemetry["dcTriggerWindshieldWipers"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * In car turn wipers on or off
 */
val IRacingData.Telemetry.dcToggleWindshieldWipers: Boolean
    get() = this.telemetry["dcToggleWindshieldWipers"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * In car low fuel accept
 */
val IRacingData.Telemetry.dcLowFuelAccept: Boolean
    get() = this.telemetry["dcLowFuelAccept"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * In car headlight flash control active
 */
val IRacingData.Telemetry.dcHeadlightFlash: Boolean
    get() = this.telemetry["dcHeadlightFlash"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * In car dash display page adjustment
 */
val IRacingData.Telemetry.dcDashPage: Float
    get() = this.telemetry["dcDashPage"]?.value?.toFloatOrNull() ?: 0f

/**
 * In car brake bias adjustment
 */
val IRacingData.Telemetry.dcBrakeBias: Float
    get() = this.telemetry["dcBrakeBias"]?.value?.toFloatOrNull() ?: 0f

/**
 * The steward says rain tires can be used
 */
val IRacingData.Telemetry.WeatherDeclaredWet: Boolean
    get() = this.telemetry["WeatherDeclaredWet"]?.value?.toBooleanStrictOrNull() ?: false

/**
 * Force feedback % max intensity
 */
val IRacingData.Telemetry.SteeringWheelPctIntensity: Float
    get() = this.telemetry["SteeringWheelPctIntensity"]?.value?.toFloatOrNull() ?: 0f

/**
 * Precipitation at start/finish line
 */
val IRacingData.Telemetry.Precipitation: Float
    get() = this.telemetry["Precipitation"]?.value?.toFloatOrNull() ?: 0f

/**
 * Shift light shift rpm
 */
val IRacingData.Telemetry.PlayerCarSLShiftRPM: Float
    get() = this.telemetry["PlayerCarSLShiftRPM"]?.value?.toFloatOrNull() ?: 0f

/**
 * Shift light last light rpm
 */
val IRacingData.Telemetry.PlayerCarSLLastRPM: Float
    get() = this.telemetry["PlayerCarSLLastRPM"]?.value?.toFloatOrNull() ?: 0f

/**
 * Shift light first light rpm
 */
val IRacingData.Telemetry.PlayerCarSLFirstRPM: Float
    get() = this.telemetry["PlayerCarSLFirstRPM"]?.value?.toFloatOrNull() ?: 0f

/**
 * Shift light blink rpm
 */
val IRacingData.Telemetry.PlayerCarSLBlinkRPM: Float
    get() = this.telemetry["PlayerCarSLBlinkRPM"]?.value?.toFloatOrNull() ?: 0f

/**
 * Distance to first car behind player in meters
 */
val IRacingData.Telemetry.CarDistBehind: Float
    get() = this.telemetry["CarDistBehind"]?.value?.toFloatOrNull() ?: 0f

/**
 * Distance to first car in front of player in meters
 */
val IRacingData.Telemetry.CarDistAhead: Float
    get() = this.telemetry["CarDistAhead"]?.value?.toFloatOrNull() ?: 0f

val IRacingData.Telemetry.CamCameraState: EnumSet<CameraStateFlags>
    get() = CameraStateFlags.fromValue(this.telemetry["CamCameraState"]?.value?.toIntOrNull() ?: 0)

val IRacingData.Telemetry.CarIdxPaceFlags: String
    get() = this.telemetry["CarIdxPaceFlags"]?.value.orEmpty()

val IRacingData.Telemetry.PitSvFlags: EnumSet<GamePitSvFlags>
    get() = GamePitSvFlags.fromValue(this.telemetry["PitSvFlags"]?.value?.toIntOrNull() ?: 0)

val IRacingData.Telemetry.SessionFlags: EnumSet<GameSessionFlags>
    get() = GameSessionFlags.fromValue(this.telemetry["SessionFlags"]?.value?.toULongOrNull() ?: 0u)

val IRacingData.Telemetry.EngineWarnings: EnumSet<EngineWarningsFlags>
    get() = EngineWarningsFlags.fromValue(this.telemetry["EngineWarnings"]?.value?.toIntOrNull() ?: 0)

val IRacingData.Telemetry.TrackWetness: Int
    get() = this.telemetry["TrackWetness"]?.value?.toIntOrNull() ?: 0

val IRacingData.Telemetry.PaceMode: Int
    get() = this.telemetry["PaceMode"]?.value?.toIntOrNull() ?: 0

val IRacingData.Telemetry.PlayerCarPitSvStatus: Int
    get() = this.telemetry["PlayerCarPitSvStatus"]?.value?.toIntOrNull() ?: 0

val IRacingData.Telemetry.PlayerTrackSurfaceMaterial: Int
    get() = this.telemetry["PlayerTrackSurfaceMaterial"]?.value?.toIntOrNull() ?: 0

val IRacingData.Telemetry.PlayerTrackSurface: TrackLocation
    get() = TrackLocation.fromValue(this.telemetry["PlayerTrackSurface"]?.value?.toIntOrNull() ?: 0)

val IRacingData.Telemetry.SessionState: GameSessionState
    get() = GameSessionState.fromValue(this.telemetry["SessionState"]?.value?.toIntOrNull() ?: 0)

val IRacingData.Telemetry.CarLeftRight: CarRadar
    get() = CarRadar.fromValue(this.telemetry["CarLeftRight"]?.value?.toIntOrNull() ?: 0)

val IRacingData.Telemetry.CarIdxTrackSurfaceMaterial: String
    get() = this.telemetry["CarIdxTrackSurfaceMaterial"]?.value.orEmpty()

val IRacingData.Telemetry.CarIdxTrackSurface: String
    get() = this.telemetry["CarIdxTrackSurface"]?.value.orEmpty()

val IRacingData.Telemetry.CarIdxSessionFlags: String
    get() = this.telemetry["CarIdxSessionFlags"]?.value.orEmpty()