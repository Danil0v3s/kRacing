| name                            | unit                 | description                                                     |
| ------------------------------- | -------------------- | --------------------------------------------------------------- |
| dpWindshieldTearoff             |                      | Pitstop windshield tearoff                                      |
| dpRRTireColdPress               | Pa                   | Pitstop rr cold tire pressure adjustment                        |
| dpRRTireChange                  |                      | Pitstop rr tire change request                                  |
| dpRFTireColdPress               | Pa                   | Pitstop rf cold tire pressure adjustment                        |
| dpRFTireChange                  |                      | Pitstop rf tire change request                                  |
| dpLRTireColdPress               | Pa                   | Pitstop lr tire cold pressure adjustment                        |
| dpLRTireChange                  |                      | Pitstop lr tire change request                                  |
| dpLFTireColdPress               | Pa                   | Pitstop lf tire cold pressure adjustment                        |
| dpLFTireChange                  |                      | Pitstop lf tire change request                                  |
| dpFuelFill                      |                      | Pitstop fuel fill flag                                          |
| dpFuelAddKg                     | kg                   | Pitstop fuel add amount                                         |
| dpFastRepair                    |                      | Pitstop fast repair set                                         |
| dcStarter                       |                      | In car trigger car starter                                      |
| dcPitSpeedLimiterToggle         |                      | In car traction control active                                  |
| YawRate_ST                      | rad/s                | Yaw rate at 360 Hz                                              |
| YawRate                         | rad/s                | Yaw rate                                                        |
| YawNorth                        | rad                  | Yaw orientation relative to north                               |
| Yaw                             | rad                  | Yaw orientation                                                 |
| WindVel                         | m/s                  | Wind velocity at start/finish line                              |
| WindDir                         | rad                  | Wind direction at start/finish line                             |
| WeatherType                     |                      | Weather type (0=constant  1=dynamic)                            |
| WaterTemp                       | C                    | Engine coolant temp                                             |
| WaterLevel                      | l                    | Engine coolant level                                            |
| Voltage                         | V                    | Engine voltage                                                  |
| VidCapEnabled                   |                      | True if video capture system is enabled                         |
| VidCapActive                    |                      | True if video currently being captured                          |
| VertAccel_ST                    | m/s^2                | Vertical acceleration (including gravity) at 360 Hz             |
| VertAccel                       | m/s^2                | Vertical acceleration (including gravity)                       |
| VelocityZ_ST                    | m/s at 360 Hz        | Z velocity                                                      |
| VelocityZ                       | m/s                  | Z velocity                                                      |
| VelocityY_ST                    | m/s at 360 Hz        | Y velocity                                                      |
| VelocityY                       | m/s                  | Y velocity                                                      |
| VelocityX_ST                    | m/s at 360 Hz        | X velocity                                                      |
| VelocityX                       | m/s                  | X velocity                                                      |
| TrackTempCrew                   | C                    | Temperature of track measured by crew around track              |
| TrackTemp                       | C                    | Deprecated  set to TrackTempCrew                                |
| TireSetsUsed                    |                      | How many tire sets used so far                                  |
| TireSetsAvailable               |                      | How many tire sets are remaining  255 is unlimited              |
| TireRR_RumblePitch              | Hz                   | Players RR Tire Sound rumblestrip pitch                         |
| TireRF_RumblePitch              | Hz                   | Players RF Tire Sound rumblestrip pitch                         |
| TireLR_RumblePitch              | Hz                   | Players LR Tire Sound rumblestrip pitch                         |
| TireLF_RumblePitch              | Hz                   | Players LF Tire Sound rumblestrip pitch                         |
| ThrottleRaw                     | %                    | Raw throttle input 0=off throttle to 1=full throttle            |
| Throttle                        | %                    | 0=off throttle to 1=full throttle                               |
| SteeringWheelUseLinear          |                      | True if steering wheel force is using linear mode               |
| SteeringWheelTorque_ST          | N*m                  | Output torque on steering shaft at 360 Hz                       |
| SteeringWheelTorque             | N*m                  | Output torque on steering shaft                                 |
| SteeringWheelPeakForceNm        | N*m                  | Peak torque mapping to direct input units for FFB               |
| SteeringWheelPctTorqueSignStops | %                    | Force feedback % max torque on steering shaft signed stops      |
| SteeringWheelPctTorqueSign      | %                    | Force feedback % max torque on steering shaft signed            |
| SteeringWheelPctTorque          | %                    | Force feedback % max torque on steering shaft unsigned          |
| SteeringWheelPctSmoothing       | %                    | Force feedback % max smoothing                                  |
| SteeringWheelPctDamper          | %                    | Force feedback % max damping                                    |
| SteeringWheelMaxForceNm         | N*m                  | Value of strength or max force slider in Nm for FFB             |
| SteeringWheelLimiter            | %                    | Force feedback limiter strength limits impacts and oscillation  |
| SteeringWheelAngleMax           | rad                  | Steering wheel max angle                                        |
| SteeringWheelAngle              | rad                  | Steering wheel angle                                            |
| Speed                           | m/s                  | GPS vehicle speed                                               |
| SolarAzimuth                    | rad                  | Sun angle clockwise from north in radians                       |
| SolarAltitude                   | rad                  | Sun angle above horizon in radians                              |
| Skies                           |                      | Skies (0=clear/1=p cloudy/2=m cloudy/3=overcast)                |
| ShiftPowerPct                   | %                    | Friction torque applied to gears when shifting or grinding      |
| ShiftIndicatorPct               | %                    | DEPRECATED use DriverCarSLBlinkRPM instead                      |
| ShiftGrindRPM                   | RPM                  | RPM of shifter grinding noise                                   |
| SessionUniqueID                 |                      | Session ID                                                      |
| SessionTimeTotal                | s                    | Total number of seconds in session                              |
| SessionTimeRemain               | s                    | Seconds left till session ends                                  |
| SessionTimeOfDay                | s                    | Time of day in seconds                                          |
| SessionTime                     | s                    | Seconds since session start                                     |
| SessionTick                     |                      | Current update number                                           |
| SessionState                    | irsdk_SessionState   | Session state                                                   |
| SessionOnJokerLap               |                      | Player is currently completing a joker lap                      |
| SessionNum                      |                      | Session number                                                  |
| SessionLapsTotal                |                      | Total number of laps in session                                 |
| SessionLapsRemainEx             |                      | New improved laps left till session ends                        |
| SessionLapsRemain               |                      | Old laps left till session ends use SessionLapsRemainEx         |
| SessionJokerLapsRemain          |                      | Joker laps remaining to be taken                                |
| SessionFlags                    | irsdk_Flags          | Session flags                                                   |
| RollRate_ST                     | rad/s                | Roll rate at 360 Hz                                             |
| RollRate                        | rad/s                | Roll rate                                                       |
| Roll                            | rad                  | Roll orientation                                                |
| RightTireSetsUsed               |                      | How many right tire sets used so far                            |
| RightTireSetsAvailable          |                      | How many right tire sets are remaining  255 is unlimited        |
| ReplaySessionTime               | s                    | Seconds since replay session start                              |
| ReplaySessionNum                |                      | Replay session number                                           |
| ReplayPlaySpeed                 |                      | Replay playback speed                                           |
| ReplayPlaySlowMotion            |                      | 0=not slow motion  1=replay is in slow motion                   |
| ReplayFrameNumEnd               |                      | Integer replay frame number from end of tape                    |
| ReplayFrameNum                  |                      | Integer replay frame number (60 per second)                     |
| RelativeHumidity                | %                    | Relative Humidity                                               |
| RearTireSetsUsed                |                      | How many rear tire sets used so far                             |
| RearTireSetsAvailable           |                      | How many rear tire sets are remaining  255 is unlimited         |
| RadioTransmitRadioIdx           |                      | The radio index of the current person speaking on the radio     |
| RadioTransmitFrequencyIdx       |                      | The frequency index of the current person speaking on the radio |
| RadioTransmitCarIdx             |                      | The car index of the current person speaking on the radio       |
| RaceLaps                        |                      | Laps completed in race                                          |
| RRwearR                         | %                    | RR tire right percent tread remaining                           |
| RRwearM                         | %                    | RR tire middle percent tread remaining                          |
| RRwearL                         | %                    | RR tire left percent tread remaining                            |
| RRtempCR                        | C                    | RR tire right carcass temperature                               |
| RRtempCM                        | C                    | RR tire middle carcass temperature                              |
| RRtempCL                        | C                    | RR tire left carcass temperature                                |
| RRshockVel_ST                   | m/s                  | RR shock velocity at 360 Hz                                     |
| RRshockVel                      | m/s                  | RR shock velocity                                               |
| RRshockDefl_ST                  | m                    | RR shock deflection at 360 Hz                                   |
| RRshockDefl                     | m                    | RR shock deflection                                             |
| RRcoldPressure                  | kPa                  | RR tire cold pressure  as set in the garage                     |
| RRbrakeLinePress                | bar                  | RR brake line pressure                                          |
| RRTiresUsed                     |                      | How many right rear tires used so far                           |
| RRTiresAvailable                |                      | How many right rear tires are remaining  255 is unlimited       |
| RPM                             | revs/min             | Engine rpm                                                      |
| RFwearR                         | %                    | RF tire right percent tread remaining                           |
| RFwearM                         | %                    | RF tire middle percent tread remaining                          |
| RFwearL                         | %                    | RF tire left percent tread remaining                            |
| RFtempCR                        | C                    | RF tire right carcass temperature                               |
| RFtempCM                        | C                    | RF tire middle carcass temperature                              |
| RFtempCL                        | C                    | RF tire left carcass temperature                                |
| RFshockVel_ST                   | m/s                  | RF shock velocity at 360 Hz                                     |
| RFshockVel                      | m/s                  | RF shock velocity                                               |
| RFshockDefl_ST                  | m                    | RF shock deflection at 360 Hz                                   |
| RFshockDefl                     | m                    | RF shock deflection                                             |
| RFcoldPressure                  | kPa                  | RF tire cold pressure  as set in the garage                     |
| RFbrakeLinePress                | bar                  | RF brake line pressure                                          |
| RFTiresUsed                     |                      | How many right front tires used so far                          |
| RFTiresAvailable                |                      | How many right front tires are remaining  255 is unlimited      |
| PushToTalk                      |                      | Push to talk button state                                       |
| PushToPass                      |                      | Push to pass button state                                       |
| PlayerTrackSurfaceMaterial      | irsdk_TrkSurf        | Players car track surface material type                         |
| PlayerTrackSurface              | irsdk_TrkLoc         | Players car track surface type                                  |
| PlayerTireCompound              |                      | Players car current tire compound                               |
| PlayerFastRepairsUsed           |                      | Players car number of fast repairs used                         |
| PlayerCarWeightPenalty          | kg                   | Players weight penalty                                          |
| PlayerCarTowTime                | s                    | Players car is being towed if time is greater than zero         |
| PlayerCarTeamIncidentCount      |                      | Players team incident count for this session                    |
| PlayerCarPowerAdjust            | %                    | Players power adjust                                            |
| PlayerCarPosition               |                      | Players position in race                                        |
| PlayerCarPitSvStatus            | irsdk_PitSvStatus    | Players car pit service status bits                             |
| PlayerCarMyIncidentCount        |                      | Players own incident count for this session                     |
| PlayerCarInPitStall             |                      | Players car is properly in there pitstall                       |
| PlayerCarIdx                    |                      | Players carIdx                                                  |
| PlayerCarDryTireSetLimit        |                      | Players dry tire set limit                                      |
| PlayerCarDriverIncidentCount    |                      | Teams current drivers incident count for this session           |
| PlayerCarClassPosition          |                      | Players class position in race                                  |
| PlayerCarClass                  |                      | Player car class id                                             |
| PitstopActive                   |                      | Is the player getting pit stop service                          |
| PitsOpen                        |                      | True if pit stop is allowed for the current player              |
| PitchRate_ST                    | rad/s                | Pitch rate at 360 Hz                                            |
| PitchRate                       | rad/s                | Pitch rate                                                      |
| Pitch                           | rad                  | Pitch orientation                                               |
| PitSvTireCompound               |                      | Pit service pending tire compound                               |
| PitSvRRP                        | kPa                  | Pit service right rear tire pressure                            |
| PitSvRFP                        | kPa                  | Pit service right front tire pressure                           |
| PitSvLRP                        | kPa                  | Pit service left rear tire pressure                             |
| PitSvLFP                        | kPa                  | Pit service left front tire pressure                            |
| PitSvFuel                       | l or kWh             | Pit service fuel add amount                                     |
| PitSvFlags                      | irsdk_PitSvFlags     | Bitfield of pit service checkboxes                              |
| PitRepairLeft                   | s                    | Time left for mandatory pit repairs if repairs are active       |
| PitOptRepairLeft                | s                    | Time left for optional repairs if repairs are active            |
| PaceMode                        | irsdk_PaceMode       | Are we pacing or not                                            |
| OnPitRoad                       |                      | Is the player car on pit road between the cones                 |
| OkToReloadTextures              |                      | True if it is ok to reload car textures at this time            |
| OilTemp                         | C                    | Engine oil temperature                                          |
| OilPress                        | bar                  | Engine oil pressure                                             |
| OilLevel                        | l                    | Engine oil level                                                |
| MemSoftPageFaultSec             |                      | Memory soft page faults per second                              |
| MemPageFaultSec                 |                      | Memory page faults per second                                   |
| ManualNoBoost                   |                      | Hybrid manual no boost state                                    |
| ManualBoost                     |                      | Hybrid manual boost state                                       |
| ManifoldPress                   | bar                  | Engine manifold pressure                                        |
| LongAccel_ST                    | m/s^2                | Longitudinal acceleration (including gravity) at 360 Hz         |
| LongAccel                       | m/s^2                | Longitudinal acceleration (including gravity)                   |
| LoadNumTextures                 |                      | True if the car_num texture will be loaded                      |
| LeftTireSetsUsed                |                      | How many left tire sets used so far                             |
| LeftTireSetsAvailable           |                      | How many left tire sets are remaining  255 is unlimited         |
| LatAccel_ST                     | m/s^2                | Lateral acceleration (including gravity) at 360 Hz              |
| LatAccel                        | m/s^2                | Lateral acceleration (including gravity)                        |
| LapLastNLapTime                 | s                    | Player last N average lap time                                  |
| LapLastLapTime                  | s                    | Players last lap time                                           |
| LapLasNLapSeq                   |                      | Player num consecutive clean laps completed for N average       |
| LapDistPct                      | %                    | Percentage distance around lap                                  |
| LapDist                         | m                    | Meters traveled from S/F this lap                               |
| LapDeltaToSessionOptimalLap_OK  |                      | Delta time for session optimal lap is valid                     |
| LapDeltaToSessionOptimalLap_DD  | s/s                  | Rate of change of delta time for session optimal lap            |
| LapDeltaToSessionOptimalLap     | s                    | Delta time for session optimal lap                              |
| LapDeltaToSessionLastlLap_OK    |                      | Delta time for session last lap is valid                        |
| LapDeltaToSessionLastlLap_DD    | s/s                  | Rate of change of delta time for session last lap               |
| LapDeltaToSessionLastlLap       | s                    | Delta time for session last lap                                 |
| LapDeltaToSessionBestLap_OK     |                      | Delta time for session best lap is valid                        |
| LapDeltaToSessionBestLap_DD     | s/s                  | Rate of change of delta time for session best lap               |
| LapDeltaToSessionBestLap        | s                    | Delta time for session best lap                                 |
| LapDeltaToOptimalLap_OK         |                      | Delta time for optimal lap is valid                             |
| LapDeltaToOptimalLap_DD         | s/s                  | Rate of change of delta time for optimal lap                    |
| LapDeltaToOptimalLap            | s                    | Delta time for optimal lap                                      |
| LapDeltaToBestLap_OK            |                      | Delta time for best lap is valid                                |
| LapDeltaToBestLap_DD            | s/s                  | Rate of change of delta time for best lap                       |
| LapDeltaToBestLap               | s                    | Delta time for best lap                                         |
| LapCurrentLapTime               | s                    | Estimate of players current lap time as shown in F3 box         |
| LapCompleted                    |                      | Laps completed count                                            |
| LapBestNLapTime                 | s                    | Player best N average lap time                                  |
| LapBestNLapLap                  |                      | Player last lap in best N average lap time                      |
| LapBestLapTime                  | s                    | Players best lap time                                           |
| LapBestLap                      |                      | Players best lap number                                         |
| Lap                             |                      | Laps started count                                              |
| LRwearR                         | %                    | LR tire right percent tread remaining                           |
| LRwearM                         | %                    | LR tire middle percent tread remaining                          |
| LRwearL                         | %                    | LR tire left percent tread remaining                            |
| LRtempCR                        | C                    | LR tire right carcass temperature                               |
| LRtempCM                        | C                    | LR tire middle carcass temperature                              |
| LRtempCL                        | C                    | LR tire left carcass temperature                                |
| LRshockVel_ST                   | m/s                  | LR shock velocity at 360 Hz                                     |
| LRshockVel                      | m/s                  | LR shock velocity                                               |
| LRshockDefl_ST                  | m                    | LR shock deflection at 360 Hz                                   |
| LRshockDefl                     | m                    | LR shock deflection                                             |
| LRcoldPressure                  | kPa                  | LR tire cold pressure  as set in the garage                     |
| LRbrakeLinePress                | bar                  | LR brake line pressure                                          |
| LRTiresUsed                     |                      | How many left rear tires used so far                            |
| LRTiresAvailable                |                      | How many left rear tires are remaining  255 is unlimited        |
| LFwearR                         | %                    | LF tire right percent tread remaining                           |
| LFwearM                         | %                    | LF tire middle percent tread remaining                          |
| LFwearL                         | %                    | LF tire left percent tread remaining                            |
| LFtempCR                        | C                    | LF tire right carcass temperature                               |
| LFtempCM                        | C                    | LF tire middle carcass temperature                              |
| LFtempCL                        | C                    | LF tire left carcass temperature                                |
| LFshockVel_ST                   | m/s                  | LF shock velocity at 360 Hz                                     |
| LFshockVel                      | m/s                  | LF shock velocity                                               |
| LFshockDefl_ST                  | m                    | LF shock deflection at 360 Hz                                   |
| LFshockDefl                     | m                    | LF shock deflection                                             |
| LFcoldPressure                  | kPa                  | LF tire cold pressure  as set in the garage                     |
| LFbrakeLinePress                | bar                  | LF brake line pressure                                          |
| LFTiresUsed                     |                      | How many left front tires used so far                           |
| LFTiresAvailable                |                      | How many left front tires are remaining  255 is unlimited       |
| IsReplayPlaying                 |                      | 0=replay not playing  1=replay playing                          |
| IsOnTrackCar                    |                      | 1=Car on track physics running                                  |
| IsOnTrack                       |                      | 1=Car on track physics running with player in car               |
| IsInGarage                      |                      | 1=Car in garage physics running                                 |
| IsGarageVisible                 |                      | 1=Garage screen is visible                                      |
| IsDiskLoggingEnabled            |                      | 0=disk based telemetry turned off  1=turned on                  |
| IsDiskLoggingActive             |                      | 0=disk based telemetry file not being written  1=being written  |
| HandbrakeRaw                    | %                    | Raw handbrake input 0=handbrake released to 1=max force         |
| GpuUsage                        | %                    | Percent of available tim gpu took with a 1 sec avg              |
| Gear                            |                      | -1=reverse  0=neutral  1..n=current gear                        |
| FuelUsePerHour                  | kg/h                 | Engine fuel used instantaneous                                  |
| FuelPress                       | bar                  | Engine fuel pressure                                            |
| FuelLevelPct                    | %                    | Percent fuel remaining                                          |
| FuelLevel                       | l                    | Liters of fuel remaining                                        |
| FrontTireSetsUsed               |                      | How many front tire sets used so far                            |
| FrontTireSetsAvailable          |                      | How many front tire sets are remaining  255 is unlimited        |
| FrameRate                       | fps                  | Average frames per second                                       |
| FogLevel                        | %                    | Fog level                                                       |
| FastRepairUsed                  |                      | How many fast repairs used so far                               |
| FastRepairAvailable             |                      | How many fast repairs left  255 is unlimited                    |
| EnterExitReset                  |                      | Indicate action the reset key will take 0 enter 1 exit 2 reset  |
| EngineWarnings                  | irsdk_EngineWarnings | Bitfield for warning lights                                     |
| Engine0_RPM                     | revs/min             | Engine0Engine rpm                                               |
| DriverMarker                    |                      | Driver activated flag                                           |
| DisplayUnits                    |                      | Default units for the user interface 0 = english 1 = metric     |
| DCLapStatus                     |                      | Status of driver change lap requirements                        |
| DCDriversSoFar                  |                      | Number of team drivers who have run a stint                     |
| CpuUsageFG                      | %                    | Percent of available tim fg thread took with a 1 sec avg        |
| CpuUsageBG                      | %                    | Percent of available tim bg thread took with a 1 sec avg        |
| ClutchRaw                       | %                    | Raw clutch input 0=disengaged to 1=fully engaged                |
| Clutch                          | %                    | 0=disengaged to 1=fully engaged                                 |
| ChanQuality                     | %                    | Communications quality                                          |
| ChanPartnerQuality              | %                    | Partner communications quality                                  |
| ChanLatency                     | s                    | Communications latency                                          |
| ChanClockSkew                   | s                    | Communications server clock skew                                |
| ChanAvgLatency                  | s                    | Communications average latency                                  |
| CarLeftRight                    | irsdk_CarLeftRight   | Notify if car is to the left or right of driver                 |
| CarIdxTrackSurfaceMaterial      | irsdk_TrkSurf        | Track surface material type by car index                        |
| CarIdxTrackSurface              | irsdk_TrkLoc         | Track surface type by car index                                 |
| CarIdxTireCompound              |                      | Cars current tire compound                                      |
| CarIdxSteer                     | rad                  | Steering wheel angle by car index                               |
| CarIdxSessionFlags              | irsdk_Flags          | Session flags for each player                                   |
| CarIdxRPM                       | revs/min             | Engine rpm by car index                                         |
| CarIdxQualTireCompoundLocked    |                      | Cars Qual tire compound is locked-in                            |
| CarIdxQualTireCompound          |                      | Cars Qual tire compound                                         |
| CarIdxPosition                  |                      | Cars position in race by car index                              |
| CarIdxPaceRow                   |                      | What row cars are pacing in  or -1 if not pacing                |
| CarIdxPaceLine                  |                      | What line cars are pacing in  or -1 if not pacing               |
| CarIdxPaceFlags                 | irsdk_PaceFlags      | Pacing status flags for each car                                |
| CarIdxP2P_Status                |                      | Push2Pass active or not                                         |
| CarIdxP2P_Count                 |                      | Push2Pass count of usage (or remaining in Race)                 |
| CarIdxOnPitRoad                 |                      | On pit road between the cones by car index                      |
| CarIdxLastLapTime               | s                    | Cars last lap time                                              |
| CarIdxLapDistPct                | %                    | Percentage distance around lap by car index                     |
| CarIdxLapCompleted              |                      | Laps completed by car index                                     |
| CarIdxLap                       |                      | Laps started by car index                                       |
| CarIdxGear                      |                      | -1=reverse  0=neutral  1..n=current gear by car index           |
| CarIdxFastRepairsUsed           |                      | How many fast repairs each car has used                         |
| CarIdxF2Time                    | s                    | Race time behind leader or fastest lap time otherwise           |
| CarIdxEstTime                   | s                    | Estimated time to reach current location on track               |
| CarIdxClassPosition             |                      | Cars class position in race by car index                        |
| CarIdxClass                     |                      | Cars class id by car index                                      |
| CarIdxBestLapTime               | s                    | Cars best lap time                                              |
| CarIdxBestLapNum                |                      | Cars best lap number                                            |
| CamGroupNumber                  |                      | Active camera group number                                      |
| CamCarIdx                       |                      | Active camera's focus car index                                 |
| CamCameraState                  | irsdk_CameraState    | State of camera system                                          |
| CamCameraNumber                 |                      | Active camera number                                            |
| BrakeRaw                        | %                    | Raw brake input 0=brake released to 1=max pedal force           |
| BrakeABSactive                  |                      | true if abs is currently reducing brake force pressure          |
| Brake                           | %                    | 0=brake released to 1=max pedal force                           |
| AirTemp                         | C                    | Temperature of air at start/finish line                         |
| AirPressure                     | Hg                   | Pressure of air at start/finish line                            |
| AirDensity                      | kg/m^3               | Density of air at start/finish line                             |
