<details>
  <summary><h1>Telemetry Data</h1></summary>

| Name                            | Unit                 | Description                                                     | Example            |
| ------------------------------- | -------------------- | --------------------------------------------------------------- | ------------------ |
| dpWindshieldTearoff             |                      | Pitstop windshield tearoff                                      | 0.0                |
| dpRRTireColdPress               | Pa                   | Pitstop rr cold tire pressure adjustment                        | 206.84271          |
| dpRRTireChange                  |                      | Pitstop rr tire change request                                  | 0.0                |
| dpRFTireColdPress               | Pa                   | Pitstop rf cold tire pressure adjustment                        | 206.84271          |
| dpRFTireChange                  |                      | Pitstop rf tire change request                                  | 0.0                |
| dpLRTireColdPress               | Pa                   | Pitstop lr tire cold pressure adjustment                        | 206.84271          |
| dpLRTireChange                  |                      | Pitstop lr tire change request                                  | 0.0                |
| dpLFTireColdPress               | Pa                   | Pitstop lf tire cold pressure adjustment                        | 206.84271          |
| dpLFTireChange                  |                      | Pitstop lf tire change request                                  | 0.0                |
| dpFuelFill                      |                      | Pitstop fuel fill flag                                          | 0.0                |
| dpFuelAddKg                     | kg                   | Pitstop fuel add amount                                         | 0.0                |
| dpFastRepair                    |                      | Pitstop fast repair set                                         | 0.0                |
| dcStarter                       |                      | In car trigger car starter                                      | false              |
| dcPitSpeedLimiterToggle         |                      | In car traction control active                                  | false              |
| YawRate_ST                      | rad/s                | Yaw rate at 360 Hz                                              | 1.1763797E-6       |
| YawRate                         | rad/s                | Yaw rate                                                        | -1.2711687E-6      |
| YawNorth                        | rad                  | Yaw orientation relative to north                               | 6.2053485          |
| Yaw                             | rad                  | Yaw orientation                                                 | 3.13907            |
| WindVel                         | m/s                  | Wind velocity at start/finish line                              | 0.89408            |
| WindDir                         | rad                  | Wind direction at start/finish line                             | 0.0                |
| WeatherType                     |                      | Weather type (0=constant  1=dynamic)                            | 3                  |
| WaterTemp                       | C                    | Engine coolant temp                                             | 81.375175          |
| WaterLevel                      | l                    | Engine coolant level                                            | 5.0                |
| Voltage                         | V                    | Engine voltage                                                  | 12.400001          |
| VidCapEnabled                   |                      | True if video capture system is enabled                         | false              |
| VidCapActive                    |                      | True if video currently being captured                          | false              |
| VertAccel_ST                    | m/s^2                | Vertical acceleration (including gravity) at 360 Hz             | 9.805689           |
| VertAccel                       | m/s^2                | Vertical acceleration (including gravity)                       | 9.80547            |
| VelocityZ_ST                    | m/s at 360 Hz        | Z velocity                                                      | 6.2038226E-4       |
| VelocityZ                       | m/s                  | Z velocity                                                      | 6.204027E-4        |
| VelocityY_ST                    | m/s at 360 Hz        | Y velocity                                                      | 0.0010824181       |
| VelocityY                       | m/s                  | Y velocity                                                      | 0.0010787299       |
| VelocityX_ST                    | m/s at 360 Hz        | X velocity                                                      | 2.749169E-4        |
| VelocityX                       | m/s                  | X velocity                                                      | 2.7407013E-4       |
| TrackTempCrew                   | C                    | Temperature of track measured by crew around track              | 41.111115          |
| TrackTemp                       | C                    | Deprecated  set to TrackTempCrew                                | 41.111115          |
| TireSetsUsed                    |                      | How many tire sets used so far                                  | 1                  |
| TireSetsAvailable               |                      | How many tire sets are remaining  255 is unlimited              | 1                  |
| TireRR_RumblePitch              | Hz                   | Players RR Tire Sound rumblestrip pitch                         | 0.0                |
| TireRF_RumblePitch              | Hz                   | Players RF Tire Sound rumblestrip pitch                         | 0.0                |
| TireLR_RumblePitch              | Hz                   | Players LR Tire Sound rumblestrip pitch                         | 0.0                |
| TireLF_RumblePitch              | Hz                   | Players LF Tire Sound rumblestrip pitch                         | 0.0                |
| ThrottleRaw                     | %                    | Raw throttle input 0=off throttle to 1=full throttle            | 0.0                |
| Throttle                        | %                    | 0=off throttle to 1=full throttle                               | 0.0                |
| SteeringWheelUseLinear          |                      | True if steering wheel force is using linear mode               | false              |
| SteeringWheelTorque_ST          | N*m                  | Output torque on steering shaft at 360 Hz                       | -0.467956          |
| SteeringWheelTorque             | N*m                  | Output torque on steering shaft                                 | -0.46772692        |
| SteeringWheelPeakForceNm        | N*m                  | Peak torque mapping to direct input units for FFB               | -1.0               |
| SteeringWheelPctTorqueSignStops | %                    | Force feedback % max torque on steering shaft signed stops      | -0.005938777       |
| SteeringWheelPctTorqueSign      | %                    | Force feedback % max torque on steering shaft signed            | -0.017990364       |
| SteeringWheelPctTorque          | %                    | Force feedback % max torque on steering shaft unsigned          | 0.017990364        |
| SteeringWheelPctSmoothing       | %                    | Force feedback % max smoothing                                  | 0.0                |
| SteeringWheelPctDamper          | %                    | Force feedback % max damping                                    | 0.0                |
| SteeringWheelMaxForceNm         | N*m                  | Value of strength or max force slider in Nm for FFB             | 32.88201           |
| SteeringWheelLimiter            | %                    | Force feedback limiter strength limits impacts and oscillation  | 0.0                |
| SteeringWheelAngleMax           | rad                  | Steering wheel max angle                                        | 17.278645          |
| SteeringWheelAngle              | rad                  | Steering wheel angle                                            | 0.060215805        |
| Speed                           | m/s                  | GPS vehicle speed                                               | 0.0011130016       |
| SolarAzimuth                    | rad                  | Sun angle clockwise from north in radians                       | 4.592536           |
| SolarAltitude                   | rad                  | Sun angle above horizon in radians                              | 0.75406283         |
| Skies                           |                      | Skies (0=clear/1=p cloudy/2=m cloudy/3=overcast)                | 1                  |
| ShiftPowerPct                   | %                    | Friction torque applied to gears when shifting or grinding      | 0.0                |
| ShiftIndicatorPct               | %                    | DEPRECATED use DriverCarSLBlinkRPM instead                      | 0.0                |
| ShiftGrindRPM                   | RPM                  | RPM of shifter grinding noise                                   | 0.0                |
| SessionUniqueID                 |                      | Session ID                                                      | 1                  |
| SessionTimeTotal                | s                    | Total number of seconds in session                              | 604800.0           |
| SessionTimeRemain               | s                    | Seconds left till session ends                                  | 604800.0           |
| SessionTimeOfDay                | s                    | Time of day in seconds                                          | 55116.0            |
| SessionTime                     | s                    | Seconds since session start                                     | 156.33333333334974 |
| SessionTick                     |                      | Current update number                                           | 9505               |
| SessionState                    | irsdk_SessionState   | Session state                                                   | 4                  |
| SessionOnJokerLap               |                      | Player is currently completing a joker lap                      | false              |
| SessionNum                      |                      | Session number                                                  | 0                  |
| SessionLapsTotal                |                      | Total number of laps in session                                 | 32767              |
| SessionLapsRemainEx             |                      | New improved laps left till session ends                        | 32767              |
| SessionLapsRemain               |                      | Old laps left till session ends use SessionLapsRemainEx         | 32767              |
| SessionJokerLapsRemain          |                      | Joker laps remaining to be taken                                | 0                  |
| SessionFlags                    | irsdk_Flags          | Session flags                                                   | 268698112          |
| RollRate_ST                     | rad/s                | Roll rate at 360 Hz                                             | 9.509059E-5        |
| RollRate                        | rad/s                | Roll rate                                                       | 1.2938127E-4       |
| Roll                            | rad                  | Roll orientation                                                | -0.013565425       |
| RightTireSetsUsed               |                      | How many right tire sets used so far                            | 1                  |
| RightTireSetsAvailable          |                      | How many right tire sets are remaining  255 is unlimited        | 1                  |
| ReplaySessionTime               | s                    | Seconds since replay session start                              | 0.0                |
| ReplaySessionNum                |                      | Replay session number                                           | -1                 |
| ReplayPlaySpeed                 |                      | Replay playback speed                                           | 1                  |
| ReplayPlaySlowMotion            |                      | 0=not slow motion  1=replay is in slow motion                   | false              |
| ReplayFrameNumEnd               |                      | Integer replay frame number from end of tape                    | 8145               |
| ReplayFrameNum                  |                      | Integer replay frame number (60 per second)                     | 0                  |
| RelativeHumidity                | %                    | Relative Humidity                                               | 0.5502516          |
| RearTireSetsUsed                |                      | How many rear tire sets used so far                             | 1                  |
| RearTireSetsAvailable           |                      | How many rear tire sets are remaining  255 is unlimited         | 1                  |
| RadioTransmitRadioIdx           |                      | The radio index of the current person speaking on the radio     | 0                  |
| RadioTransmitFrequencyIdx       |                      | The frequency index of the current person speaking on the radio | 0                  |
| RadioTransmitCarIdx             |                      | The car index of the current person speaking on the radio       | -1                 |
| RaceLaps                        |                      | Laps completed in race                                          | 0                  |
| RRwearR                         | %                    | RR tire right percent tread remaining                           | 1.0                |
| RRwearM                         | %                    | RR tire middle percent tread remaining                          | 1.0                |
| RRwearL                         | %                    | RR tire left percent tread remaining                            | 1.0                |
| RRtempCR                        | C                    | RR tire right carcass temperature                               | 39.368835          |
| RRtempCM                        | C                    | RR tire middle carcass temperature                              | 39.368835          |
| RRtempCL                        | C                    | RR tire left carcass temperature                                | 39.368835          |
| RRshockVel_ST                   | m/s                  | RR shock velocity at 360 Hz                                     | 4.5944696E-5       |
| RRshockVel                      | m/s                  | RR shock velocity                                               | 4.0513634E-5       |
| RRshockDefl_ST                  | m                    | RR shock deflection at 360 Hz                                   | 0.14835995         |
| RRshockDefl                     | m                    | RR shock deflection                                             | 0.14836058         |
| RRcoldPressure                  | kPa                  | RR tire cold pressure  as set in the garage                     | 206.84273          |
| RRbrakeLinePress                | bar                  | RR brake line pressure                                          | 0.0                |
| RRTiresUsed                     |                      | How many right rear tires used so far                           | 1                  |
| RRTiresAvailable                |                      | How many right rear tires are remaining  255 is unlimited       | 1                  |
| RPM                             | revs/min             | Engine rpm                                                      | 5550.727           |
| RFwearR                         | %                    | RF tire right percent tread remaining                           | 1.0                |
| RFwearM                         | %                    | RF tire middle percent tread remaining                          | 1.0                |
| RFwearL                         | %                    | RF tire left percent tread remaining                            | 1.0                |
| RFtempCR                        | C                    | RF tire right carcass temperature                               | 39.368835          |
| RFtempCM                        | C                    | RF tire middle carcass temperature                              | 39.368835          |
| RFtempCL                        | C                    | RF tire left carcass temperature                                | 39.368835          |
| RFshockVel_ST                   | m/s                  | RF shock velocity at 360 Hz                                     | 1.2525095E-5       |
| RFshockVel                      | m/s                  | RF shock velocity                                               | 4.2920233E-6       |
| RFshockDefl_ST                  | m                    | RF shock deflection at 360 Hz                                   | 0.14038269         |
| RFshockDefl                     | m                    | RF shock deflection                                             | 0.14038278         |
| RFcoldPressure                  | kPa                  | RF tire cold pressure  as set in the garage                     | 206.84273          |
| RFbrakeLinePress                | bar                  | RF brake line pressure                                          | 0.0                |
| RFTiresUsed                     |                      | How many right front tires used so far                          | 1                  |
| RFTiresAvailable                |                      | How many right front tires are remaining  255 is unlimited      | 1                  |
| PushToTalk                      |                      | Push to talk button state                                       | false              |
| PushToPass                      |                      | Push to pass button state                                       | false              |
| PlayerTrackSurfaceMaterial      | irsdk_TrkSurf        | Players car track surface material type                         | 5                  |
| PlayerTrackSurface              | irsdk_TrkLoc         | Players car track surface type                                  | 1                  |
| PlayerTireCompound              |                      | Players car current tire compound                               | 0                  |
| PlayerFastRepairsUsed           |                      | Players car number of fast repairs used                         | 0                  |
| PlayerCarWeightPenalty          | kg                   | Players weight penalty                                          | 0.0                |
| PlayerCarTowTime                | s                    | Players car is being towed if time is greater than zero         | 0.0                |
| PlayerCarTeamIncidentCount      |                      | Players team incident count for this session                    | 0                  |
| PlayerCarPowerAdjust            | %                    | Players power adjust                                            | 0.0                |
| PlayerCarPosition               |                      | Players position in race                                        | 0                  |
| PlayerCarPitSvStatus            | irsdk_PitSvStatus    | Players car pit service status bits                             | 0                  |
| PlayerCarMyIncidentCount        |                      | Players own incident count for this session                     | 0                  |
| PlayerCarInPitStall             |                      | Players car is properly in there pitstall                       | false              |
| PlayerCarIdx                    |                      | Players carIdx                                                  | 0                  |
| PlayerCarDryTireSetLimit        |                      | Players dry tire set limit                                      | 0                  |
| PlayerCarDriverIncidentCount    |                      | Teams current drivers incident count for this session           | 0                  |
| PlayerCarClassPosition          |                      | Players class position in race                                  | 0                  |
| PlayerCarClass                  |                      | Player car class id                                             | 0                  |
| PitstopActive                   |                      | Is the player getting pit stop service                          | false              |
| PitsOpen                        |                      | True if pit stop is allowed for the current player              | false              |
| PitchRate_ST                    | rad/s                | Pitch rate at 360 Hz                                            | -2.0075408E-6      |
| PitchRate                       | rad/s                | Pitch rate                                                      | -3.8798503E-6      |
| Pitch                           | rad                  | Pitch orientation                                               | 0.0071268007       |
| PitSvTireCompound               |                      | Pit service pending tire compound                               | 0                  |
| PitSvRRP                        | kPa                  | Pit service right rear tire pressure                            | 206.84273          |
| PitSvRFP                        | kPa                  | Pit service right front tire pressure                           | 206.84273          |
| PitSvLRP                        | kPa                  | Pit service left rear tire pressure                             | 206.84273          |
| PitSvLFP                        | kPa                  | Pit service left front tire pressure                            | 206.84273          |
| PitSvFuel                       | l or kWh             | Pit service fuel add amount                                     | 0.0                |
| PitSvFlags                      | irsdk_PitSvFlags     | Bitfield of pit service checkboxes                              | 0                  |
| PitRepairLeft                   | s                    | Time left for mandatory pit repairs if repairs are active       | 0.0                |
| PitOptRepairLeft                | s                    | Time left for optional repairs if repairs are active            | 0.0                |
| PaceMode                        | irsdk_PaceMode       | Are we pacing or not                                            | 4                  |
| OnPitRoad                       |                      | Is the player car on pit road between the cones                 | false              |
| OkToReloadTextures              |                      | True if it is ok to reload car textures at this time            | false              |
| OilTemp                         | C                    | Engine oil temperature                                          | 83.723625          |
| OilPress                        | bar                  | Engine oil pressure                                             | 4.081999           |
| OilLevel                        | l                    | Engine oil level                                                | 6.4                |
| MemSoftPageFaultSec             |                      | Memory soft page faults per second                              | 12921.0            |
| MemPageFaultSec                 |                      | Memory page faults per second                                   | 81.0               |
| ManualNoBoost                   |                      | Hybrid manual no boost state                                    | false              |
| ManualBoost                     |                      | Hybrid manual boost state                                       | false              |
| ManifoldPress                   | bar                  | Engine manifold pressure                                        | 0.3387351          |
| LongAccel_ST                    | m/s^2                | Longitudinal acceleration (including gravity) at 360 Hz         | -0.06998322        |
| LongAccel                       | m/s^2                | Longitudinal acceleration (including gravity)                   | -0.0699517         |
| LoadNumTextures                 |                      | True if the car_num texture will be loaded                      | false              |
| LeftTireSetsUsed                |                      | How many left tire sets used so far                             | 1                  |
| LeftTireSetsAvailable           |                      | How many left tire sets are remaining  255 is unlimited         | 1                  |
| LatAccel_ST                     | m/s^2                | Lateral acceleration (including gravity) at 360 Hz              | -0.13349092        |
| LatAccel                        | m/s^2                | Lateral acceleration (including gravity)                        | -0.13333057        |
| LapLastNLapTime                 | s                    | Player last N average lap time                                  | 0.0                |
| LapLastLapTime                  | s                    | Players last lap time                                           | 0.0                |
| LapLasNLapSeq                   |                      | Player num consecutive clean laps completed for N average       | 0                  |
| LapDistPct                      | %                    | Percentage distance around lap                                  | 0.99518114         |
| LapDist                         | m                    | Meters traveled from S/F this lap                               | 3637.08            |
| LapDeltaToSessionOptimalLap_OK  |                      | Delta time for session optimal lap is valid                     | false              |
| LapDeltaToSessionOptimalLap_DD  | s/s                  | Rate of change of delta time for session optimal lap            | 0.0                |
| LapDeltaToSessionOptimalLap     | s                    | Delta time for session optimal lap                              | 0.0                |
| LapDeltaToSessionLastlLap_OK    |                      | Delta time for session last lap is valid                        | false              |
| LapDeltaToSessionLastlLap_DD    | s/s                  | Rate of change of delta time for session last lap               | 0.0                |
| LapDeltaToSessionLastlLap       | s                    | Delta time for session last lap                                 | 0.0                |
| LapDeltaToSessionBestLap_OK     |                      | Delta time for session best lap is valid                        | false              |
| LapDeltaToSessionBestLap_DD     | s/s                  | Rate of change of delta time for session best lap               | 0.0                |
| LapDeltaToSessionBestLap        | s                    | Delta time for session best lap                                 | 0.0                |
| LapDeltaToOptimalLap_OK         |                      | Delta time for optimal lap is valid                             | false              |
| LapDeltaToOptimalLap_DD         | s/s                  | Rate of change of delta time for optimal lap                    | 0.0                |
| LapDeltaToOptimalLap            | s                    | Delta time for optimal lap                                      | 0.0                |
| LapDeltaToBestLap_OK            |                      | Delta time for best lap is valid                                | false              |
| LapDeltaToBestLap_DD            | s/s                  | Rate of change of delta time for best lap                       | 0.0                |
| LapDeltaToBestLap               | s                    | Delta time for best lap                                         | 0.0                |
| LapCurrentLapTime               | s                    | Estimate of players current lap time as shown in F3 box         | 0.0                |
| LapCompleted                    |                      | Laps completed count                                            | -1                 |
| LapBestNLapTime                 | s                    | Player best N average lap time                                  | 0.0                |
| LapBestNLapLap                  |                      | Player last lap in best N average lap time                      | 0                  |
| LapBestLapTime                  | s                    | Players best lap time                                           | 0.0                |
| LapBestLap                      |                      | Players best lap number                                         | 0                  |
| Lap                             |                      | Laps started count                                              | 0                  |
| LRwearR                         | %                    | LR tire right percent tread remaining                           | 1.0                |
| LRwearM                         | %                    | LR tire middle percent tread remaining                          | 1.0                |
| LRwearL                         | %                    | LR tire left percent tread remaining                            | 1.0                |
| LRtempCR                        | C                    | LR tire right carcass temperature                               | 39.368835          |
| LRtempCM                        | C                    | LR tire middle carcass temperature                              | 39.368835          |
| LRtempCL                        | C                    | LR tire left carcass temperature                                | 39.368835          |
| LRshockVel_ST                   | m/s                  | LR shock velocity at 360 Hz                                     | -6.115458E-5       |
| LRshockVel                      | m/s                  | LR shock velocity                                               | -6.83059E-5        |
| LRshockDefl_ST                  | m                    | LR shock deflection at 360 Hz                                   | 0.1467368          |
| LRshockDefl                     | m                    | LR shock deflection                                             | 0.14673582         |
| LRcoldPressure                  | kPa                  | LR tire cold pressure  as set in the garage                     | 206.84273          |
| LRbrakeLinePress                | bar                  | LR brake line pressure                                          | 0.0                |
| LRTiresUsed                     |                      | How many left rear tires used so far                            | 1                  |
| LRTiresAvailable                |                      | How many left rear tires are remaining  255 is unlimited        | 1                  |
| LFwearR                         | %                    | LF tire right percent tread remaining                           | 1.0                |
| LFwearM                         | %                    | LF tire middle percent tread remaining                          | 1.0                |
| LFwearL                         | %                    | LF tire left percent tread remaining                            | 1.0                |
| LFtempCR                        | C                    | LF tire right carcass temperature                               | 39.368835          |
| LFtempCM                        | C                    | LF tire middle carcass temperature                              | 39.368835          |
| LFtempCL                        | C                    | LF tire left carcass temperature                                | 39.368835          |
| LFshockVel_ST                   | m/s                  | LF shock velocity at 360 Hz                                     | -3.0052908E-5      |
| LFshockVel                      | m/s                  | LF shock velocity                                               | -1.9430292E-5      |
| LFshockDefl_ST                  | m                    | LF shock deflection at 360 Hz                                   | 0.14036404         |
| LFshockDefl                     | m                    | LF shock deflection                                             | 0.14036372         |
| LFcoldPressure                  | kPa                  | LF tire cold pressure  as set in the garage                     | 206.84273          |
| LFbrakeLinePress                | bar                  | LF brake line pressure                                          | 0.0                |
| LFTiresUsed                     |                      | How many left front tires used so far                           | 1                  |
| LFTiresAvailable                |                      | How many left front tires are remaining  255 is unlimited       | 1                  |
| IsReplayPlaying                 |                      | 0=replay not playing  1=replay playing                          | false              |
| IsOnTrackCar                    |                      | 1=Car on track physics running                                  | false              |
| IsOnTrack                       |                      | 1=Car on track physics running with player in car               | false              |
| IsInGarage                      |                      | 1=Car in garage physics running                                 | false              |
| IsGarageVisible                 |                      | 1=Garage screen is visible                                      | false              |
| IsDiskLoggingEnabled            |                      | 0=disk based telemetry turned off  1=turned on                  | false              |
| IsDiskLoggingActive             |                      | 0=disk based telemetry file not being written  1=being written  | false              |
| HandbrakeRaw                    | %                    | Raw handbrake input 0=handbrake released to 1=max force         | 0.0                |
| GpuUsage                        | %                    | Percent of available tim gpu took with a 1 sec avg              | 0.09127116         |
| Gear                            |                      | -1=reverse  0=neutral  1..n=current gear                        | 0                  |
| FuelUsePerHour                  | kg/h                 | Engine fuel used instantaneous                                  | 0.0                |
| FuelPress                       | bar                  | Engine fuel pressure                                            | 4.0                |
| FuelLevelPct                    | %                    | Percent fuel remaining                                          | 0.6958347          |
| FuelLevel                       | l                    | Liters of fuel remaining                                        | 31.303282          |
| FrontTireSetsUsed               |                      | How many front tire sets used so far                            | 1                  |
| FrontTireSetsAvailable          |                      | How many front tire sets are remaining  255 is unlimited        | 1                  |
| FrameRate                       | fps                  | Average frames per second                                       | 84.004326          |
| FogLevel                        | %                    | Fog level                                                       | 0.0                |
| FastRepairUsed                  |                      | How many fast repairs used so far                               | 0                  |
| FastRepairAvailable             |                      | How many fast repairs left  255 is unlimited                    | 0                  |
| EnterExitReset                  |                      | Indicate action the reset key will take 0 enter 1 exit 2 reset  | 1                  |
| EngineWarnings                  | irsdk_EngineWarnings | Bitfield for warning lights                                     | 0                  |
| Engine0_RPM                     | revs/min             | Engine0Engine rpm                                               | 5550.7295          |
| DriverMarker                    |                      | Driver activated flag                                           | false              |
| DisplayUnits                    |                      | Default units for the user interface 0 = english 1 = metric     | 0                  |
| DCLapStatus                     |                      | Status of driver change lap requirements                        | 2                  |
| DCDriversSoFar                  |                      | Number of team drivers who have run a stint                     | 1                  |
| CpuUsageFG                      | %                    | Percent of available tim fg thread took with a 1 sec avg        | 0.14266565         |
| CpuUsageBG                      | %                    | Percent of available tim bg thread took with a 1 sec avg        | 0.09499992         |
| ClutchRaw                       | %                    | Raw clutch input 0=disengaged to 1=fully engaged                | 1.0                |
| Clutch                          | %                    | 0=disengaged to 1=fully engaged                                 | 0.0                |
| ChanQuality                     | %                    | Communications quality                                          | 1.0012693          |
| ChanPartnerQuality              | %                    | Partner communications quality                                  | 1.0                |
| ChanLatency                     | s                    | Communications latency                                          | 0.033333335        |
| ChanClockSkew                   | s                    | Communications server clock skew                                | 0.0                |
| ChanAvgLatency                  | s                    | Communications average latency                                  | 0.033333078        |
| CarLeftRight                    | irsdk_CarLeftRight   | Notify if car is to the left or right of driver                 | 1                  |
| CarIdxTrackSurfaceMaterial      | irsdk_TrkSurf        | Track surface material type by car index                        | 5                  |
| CarIdxTrackSurface              | irsdk_TrkLoc         | Track surface type by car index                                 | 1                  |
| CarIdxTireCompound              |                      | Cars current tire compound                                      | 0                  |
| CarIdxSteer                     | rad                  | Steering wheel angle by car index                               | 0.060215805        |
| CarIdxSessionFlags              | irsdk_Flags          | Session flags for each player                                   | 262144             |
| CarIdxRPM                       | revs/min             | Engine rpm by car index                                         | 5550.727           |
| CarIdxQualTireCompoundLocked    |                      | Cars Qual tire compound is locked-in                            | false              |
| CarIdxQualTireCompound          |                      | Cars Qual tire compound                                         | -1                 |
| CarIdxPosition                  |                      | Cars position in race by car index                              | 0                  |
| CarIdxPaceRow                   |                      | What row cars are pacing in  or -1 if not pacing                | -1                 |
| CarIdxPaceLine                  |                      | What line cars are pacing in  or -1 if not pacing               | -1                 |
| CarIdxPaceFlags                 | irsdk_PaceFlags      | Pacing status flags for each car                                | 0                  |
| CarIdxP2P_Status                |                      | Push2Pass active or not                                         | false              |
| CarIdxP2P_Count                 |                      | Push2Pass count of usage (or remaining in Race)                 | -1                 |
| CarIdxOnPitRoad                 |                      | On pit road between the cones by car index                      | false              |
| CarIdxLastLapTime               | s                    | Cars last lap time                                              | -1.0               |
| CarIdxLapDistPct                | %                    | Percentage distance around lap by car index                     | 0.99518114         |
| CarIdxLapCompleted              |                      | Laps completed by car index                                     | -1                 |
| CarIdxLap                       |                      | Laps started by car index                                       | 0                  |
| CarIdxGear                      |                      | -1=reverse  0=neutral  1..n=current gear by car index           | 0                  |
| CarIdxFastRepairsUsed           |                      | How many fast repairs each car has used                         | 0                  |
| CarIdxF2Time                    | s                    | Race time behind leader or fastest lap time otherwise           | 0.0                |
| CarIdxEstTime                   | s                    | Estimated time to reach current location on track               | 101.52743          |
| CarIdxClassPosition             |                      | Cars class position in race by car index                        | 0                  |
| CarIdxClass                     |                      | Cars class id by car index                                      | 0                  |
| CarIdxBestLapTime               | s                    | Cars best lap time                                              | -1.0               |
| CarIdxBestLapNum                |                      | Cars best lap number                                            | -1                 |
| CamGroupNumber                  |                      | Active camera group number                                      | 9                  |
| CamCarIdx                       |                      | Active camera's focus car index                                 | 0                  |
| CamCameraState                  | irsdk_CameraState    | State of camera system                                          | 80                 |
| CamCameraNumber                 |                      | Active camera number                                            | 1                  |
| BrakeRaw                        | %                    | Raw brake input 0=brake released to 1=max pedal force           | 0.0                |
| BrakeABSactive                  |                      | true if abs is currently reducing brake force pressure          | false              |
| Brake                           | %                    | 0=brake released to 1=max pedal force                           | 1.0                |
| AirTemp                         | C                    | Temperature of air at start/finish line                         | 25.548302          |
| AirPressure                     | Hg                   | Pressure of air at start/finish line                            | 28.98893           |
| AirDensity                      | kg/m^3               | Density of air at start/finish line                             | 1.1369911          |
| dpFuelAutoFillEnabled           |                      | Pitstop auto fill fuel system enabled                           | 0.0                |
| dpFuelAutoFillActive            |                      | Pitstop auto fill fuel next stop flag                           | 0.0                |
| dcTriggerWindshieldWipers       |                      | In car momentarily turn on wipers                               | false              |
| dcToggleWindshieldWipers        |                      | In car turn wipers on or off                                    | false              |
| dcLowFuelAccept                 |                      | In car low fuel accept                                          | false              |
| dcHeadlightFlash                |                      | In car headlight flash control active                           | false              |
| dcDashPage                      |                      | In car dash display page adjustment                             | 0.0                |
| dcBrakeBias                     |                      | In car brake bias adjustment                                    | 42.07857           |
| WeatherDeclaredWet              |                      | The steward says rain tires can be used                         | false              |
| TrackWetness                    | irsdk_TrackWetness   | How wet is the average track surface                            | 1                  |
| SteeringWheelPctIntensity       | %                    | Force feedback % max intensity                                  | 0.0                |
| Precipitation                   | %                    | Precipitation at start/finish line                              | 0.0                |
| PlayerCarSLShiftRPM             | revs/min             | Shift light shift rpm                                           | 8500.0             |
| PlayerCarSLLastRPM              | revs/min             | Shift light last light rpm                                      | 8500.0             |
| PlayerCarSLFirstRPM             | revs/min             | Shift light first light rpm                                     | 6700.0             |
| PlayerCarSLBlinkRPM             | revs/min             | Shift light blink rpm                                           | 8700.0             |
| CarDistBehind                   | m                    | Distance to first car behind player in meters                   | 500000.0           |
| CarDistAhead                    | m                    | Distance to first car in front of player in meters              | 500000.0           |
</details>

<details>
<summary><h1>Enum fields</h1></summary>
  
```cs
  
public enum irsdk_StatusField
{
	irsdk_stDisconnected = 0,
	irsdk_stConnected = 1
};

public enum irsdk_VarType
{
	// 1 byte
	irsdk_char = 0,
	irsdk_bool,

	// 4 bytes
	irsdk_int,
	irsdk_bitField,
	irsdk_float,

	// 8 bytes
	irsdk_double,

	//index, don't use
	//irsdk_ETCount
};

//public static readonly int[] irsdk_VarTypeBytes, see IRSDKHelper.getVarTypeBytes() 

// status 
public enum irsdk_TrkLoc
{
	irsdk_NotInWorld = -1,
	irsdk_OffTrack = 0,
	irsdk_InPitStall,
	irsdk_AproachingPits,
	irsdk_OnTrack
};

public enum irsdk_TrkSurf
{
	irsdk_SurfaceNotInWorld = -1,
	irsdk_UndefinedMaterial = 0,

	irsdk_Asphalt1Material,
	irsdk_Asphalt2Material,
	irsdk_Asphalt3Material,
	irsdk_Asphalt4Material,
	irsdk_Concrete1Material,
	irsdk_Concrete2Material,
	irsdk_RacingDirt1Material,
	irsdk_RacingDirt2Material,
	irsdk_Paint1Material,
	irsdk_Paint2Material,
	irsdk_Rumble1Material,
	irsdk_Rumble2Material,
	irsdk_Rumble3Material,
	irsdk_Rumble4Material,

	irsdk_Grass1Material,
	irsdk_Grass2Material,
	irsdk_Grass3Material,
	irsdk_Grass4Material,
	irsdk_Dirt1Material,
	irsdk_Dirt2Material,
	irsdk_Dirt3Material,
	irsdk_Dirt4Material,
	irsdk_SandMaterial,
	irsdk_Gravel1Material,
	irsdk_Gravel2Material,
	irsdk_GrasscreteMaterial,
	irsdk_AstroturfMaterial,
};

public enum irsdk_SessionState
{
	irsdk_StateInvalid = 0,
	irsdk_StateGetInCar,
	irsdk_StateWarmup,
	irsdk_StateParadeLaps,
	irsdk_StateRacing,
	irsdk_StateCheckered,
	irsdk_StateCoolDown
};

public enum irsdk_CarLeftRight
{
	irsdk_LROff = 0,
	irsdk_LRClear,			// no cars around us.
	irsdk_LRCarLeft,		// there is a car to our left.
	irsdk_LRCarRight,		// there is a car to our right.
	irsdk_LRCarLeftRight,	// there are cars on each side.
	irsdk_LR2CarsLeft,		// there are two cars to our left.
	irsdk_LR2CarsRight		// there are two cars to our right.
};

public enum irsdk_PitSvStatus
{
	// status
	irsdk_PitSvNone = 0,
	irsdk_PitSvInProgress,
	irsdk_PitSvComplete,

	// errors
	irsdk_PitSvTooFarLeft = 100,
	irsdk_PitSvTooFarRight,
	irsdk_PitSvTooFarForward,
	irsdk_PitSvTooFarBack,
	irsdk_PitSvBadAngle,
	irsdk_PitSvCantFixThat,
};

public enum irsdk_PaceMode
{
	irsdk_PaceModeSingleFileStart = 0,
	irsdk_PaceModeDoubleFileStart,
	irsdk_PaceModeSingleFileRestart,
	irsdk_PaceModeDoubleFileRestart,
	irsdk_PaceModeNotPacing,
};

public enum irsdk_WeatherDynamics
{
	irsdk_WeatherDynamics_Specified_FixedSky = 0, // specified  weather / fixed sky
	irsdk_WeatherDynamics_Generated_SkyMoves,     // generated weather / dynamic sky
	irsdk_WeatherDynamics_Generated_FixedSky,     // generated weather / fixed sky
	irsdk_WeatherDynamics_Specified_SkyMoves,     // constant  weather / dynamic sky             
};

public enum irsdk_WeatherVersion
{
	irsdk_WeatherVersion_Classic = 0,   // 0 : default init in replays prior to W2 being rolled out (no rain)
	irsdk_WeatherVersion_ForecastBased, // 1 : usual way to handle realistic weather in W2
	irsdk_WeatherVersion_StaticTest_Day,// 2 : W2 version of "WEATHER_DYNAMICS_GENERATED_FIXEDSKY" that adds possibility of track water
	irsdk_WeatherVersion_TimelineBased, // 3 : a timeline of desired specific events in W2
};
```
</details>

<details>
<summary><h1>Bitwise fields</h1></summary>

```cs
[Flags]
public enum irsdk_EngineWarnings
{
	irsdk_waterTempWarning		= 0x0001,
	irsdk_fuelPressureWarning	= 0x0002,
	irsdk_oilPressureWarning	= 0x0004,
	irsdk_engineStalled			= 0x0008,
	irsdk_pitSpeedLimiter		= 0x0010,
	irsdk_revLimiterActive		= 0x0020,
	irsdk_oilTempWarning		= 0x0040,
};

[Flags]
public enum irsdk_Flags : ulong
{
	// global flags
	irsdk_checkered				= 0x00000001,
	irsdk_white					= 0x00000002,
	irsdk_green					= 0x00000004,
	irsdk_yellow				= 0x00000008,
	irsdk_red					= 0x00000010,
	irsdk_blue					= 0x00000020,
	irsdk_debris				= 0x00000040,
	irsdk_crossed				= 0x00000080,
	irsdk_yellowWaving			= 0x00000100,
	irsdk_oneLapToGreen			= 0x00000200,
	irsdk_greenHeld				= 0x00000400,
	irsdk_tenToGo				= 0x00000800,
	irsdk_fiveToGo				= 0x00001000,
	irsdk_randomWaving			= 0x00002000,
	irsdk_caution				= 0x00004000,
	irsdk_cautionWaving			= 0x00008000,

	// drivers black flags
	irsdk_black					= 0x00010000,
	irsdk_disqualify			= 0x00020000,
	irsdk_servicible			= 0x00040000, // car is allowed service (not a flag)
	irsdk_furled				= 0x00080000,
	irsdk_repair				= 0x00100000,

	// start lights
	irsdk_startHidden			= 0x10000000,
	irsdk_startReady			= 0x20000000,
	irsdk_startSet				= 0x40000000,
	irsdk_startGo				= 0x80000000,
};

[Flags]
public enum irsdk_CameraState
{
	irsdk_IsSessionScreen		= 0x0001, // the camera tool can only be activated if viewing the session screen (out of car)
	irsdk_IsScenicActive		= 0x0002, // the scenic camera is active (no focus car)

	//these can be changed with a broadcast message
	irsdk_CamToolActive			= 0x0004,
	irsdk_UIHidden				= 0x0008,
	irsdk_UseAutoShotSelection	= 0x0010,
	irsdk_UseTemporaryEdits		= 0x0020,
	irsdk_UseKeyAcceleration	= 0x0040,
	irsdk_UseKey10xAcceleration	= 0x0080,
	irsdk_UseMouseAimMode		= 0x0100
};

[Flags]
public enum irsdk_PitSvFlags
{
	irsdk_LFTireChange			= 0x0001,
	irsdk_RFTireChange			= 0x0002,
	irsdk_LRTireChange			= 0x0004,
	irsdk_RRTireChange			= 0x0008,

	irsdk_FuelFill				= 0x0010,
	irsdk_WindshieldTearoff		= 0x0020,
	irsdk_FastRepair			= 0x0040
};

[Flags]
public enum irsdk_PaceFlags
{
	irsdk_PaceFlagsEndOfLine	= 0x0001,
	irsdk_PaceFlagsFreePass		= 0x0002,
	irsdk_PaceFlagsWavedAround	= 0x0004,
};
```


</details>
