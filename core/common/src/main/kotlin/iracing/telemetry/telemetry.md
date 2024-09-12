# Appendix A – Live data list

iRacing’s telemetry comes in three variations, data written to an .ibt file 60 times a second live data exposed to our telemetry API 60 times a second, and a session string in YAML format that contains more or less static information about the session.",,,,,The YAML string is appended to the end of the .ibt file but only a small portion of that data is exposed to ATLAS.,,,,,We will cover the YAML string in appendix B.,

Here is a list, as of 11/03/2015 of all the live and disk based telemetry parameters. Only the disk based parameters are available to ATLAS.

|Name                            |Unit                 |Type     |Disk |Live | Description                                                        |
|--------------------------------|---------------------|---------|-----|-----|--------------------------------------------------------------------|
|AirDensity                      |kg/m^3               |float    |1    |1    | Density of air at start/finish line                                |
|AirPressure                     |Hg                   |float    |1    |1    | Pressure of air at start/finish line                               |
|AirTemp                         |C                    |float    |1    |1    | Temperature of air at start/finish line                            |
|Alt                             |m                    |float    |1    |1    | Altitude in meters                                                 |
|Brake                           |%                    |float    |1    |1    | 0=brake released to 1=max pedal force                              |
|BrakeRaw                        |%                    |float    |1    |1    | Raw brake input 0=brake released to 1=max pedal force              |
|CamCameraNumber                 |                     |int      |0    |1    | Active camera number                                               |
|CamCameraState                  |irsdk_CameraState    |bitfield |0    |1    | State of camera system                                             |
|CamCarIdx                       |                     |int      |0    |1    | Active camera's focus car index                                    |
|CamGroupNumber                  |                     |int      |0    |1    | Active camera group number                                         |
|Clutch                          |%                    |float    |1    |1    | 0=disengaged to 1=fully engaged                                    |
|CpuUsageBG                      |%                    |float    |1    |1    | Percent of available tim bg thread took with a 1 sec avg           |
|DCDriversSoFar                  |                     |int      |0    |1    | Number of team drivers who have run a stint                        |
|DCLapStatus                     |                     |int      |0    |1    | Status of driver change lap requirements                           |
|DisplayUnits                    |                     |int      |0    |1    | Default units for the user interface 0 = english 1 = metric        |
|DriverMarker                    |                     |bool     |1    |1    | Driver activated flag                                              |
|EngineWarnings                  |irsdk_EngineWarnings |bitfield |1    |1    | Bitfield for warning lights                                        |
|EnterExitReset                  |                     |int      |1    |1    | Indicate action the reset key will take 0 enter 1 exit 2 reset     |
|FogLevel                        |%                    |float    |1    |1    | Fog level                                                          |
|FrameRate                       |fps                  |float    |1    |1    | Average frames per second                                          |
|FuelLevel                       |l                    |float    |1    |1    | Liters of fuel remaining                                           |
|FuelLevelPct                    |%                    |float    |1    |1    | Percent fuel remaining                                             |
|FuelPress                       |bar                  |float    |1    |1    | Engine fuel pressure                                               |
|FuelUsePerHour                  |kg/h                 |float    |1    |1    | Engine fuel used instantaneous                                     |
|Name                            | Unit                | Type    |Disk |Live | Description                                                        |
|Gear                            |                     |int      |1    |1    | -1=reverse,0=neutral,1..n=current gear,1=being written,1=turned on |
|IsDiskLoggingActive             |                     |bool     |0    |1    | 0=disk based telemetry file not being written                      |
|IsDiskLoggingEnabled            |                     |bool     |0    |1    | 0=disk based telemetry turned off                                  |
|IsInGarage                      |                     |bool     |0    |1    | 1=Car in garage physics running                                    |
|IsOnTrack                       |                     |bool     |1    |1    | 1=Car on track physics running with player in car                  |
|IsOnTrackCar                    |                     |bool     |1    |1    | 1=Car on track physics running                                     |
|IsReplayPlaying                 |                     |bool     |0    |1    | 0=replay not playing 1=replay playing                              |
|Lap                             |                     |int      |1    |1    | Lap count                                                          |
|LapBestLap                      |                     |int      |1    |1    | Players best lap number                                            |
|LapBestLapTime                  |s                    |float    |1    |1    | Players best lap time                                              |
|LapBestNLapLap                  |                     |int      |1    |1    | Player last lap in best N average lap time                         |
|LapBestNLapTime                 |s                    |float    |1    |1    | Player best N average lap time                                     |
|LapCurrentLapTime               |s                    |float    |1    |1    | Estimate of players current lap time as shown in F3 box            |
|LapDeltaToBestLap               |s                    |float    |1    |1    | Delta time for best lap                                            |
|LapDeltaToBestLap_DD            |s/s                  |float    |1    |1    | Rate of change of delta time for best lap                          |
|LapDeltaToBestLap_OK            |                     |bool     |1    |1    | Delta time for best lap is valid                                   |
|LapDeltaToOptimalLap            |s                    |float    |1    |1    | Delta time for optimal lap                                         |
|LapDeltaToOptimalLap_DD         |s/s                  |float    |1    |1    | Rate of change of delta time for optimal lap                       |
|LapDeltaToOptimalLap_OK         |                     |bool     |1    |1    | Delta time for optimal lap is valid                                |
|LapDeltaToSessionBestLap        |s                    |float    |1    |1    | Delta time for session best lap                                    |
|LapDeltaToSessionBestLap_DD     |s/s                  |float    |1    |1    | Rate of change of delta time for session best lap                  |
|LapDeltaToSessionBestLap_OK     |                     |bool     |1    |1    | Delta time for session best lap is valid                           |
|LapDeltaToSessionLastlLap       |s                    |float    |1    |1    | Delta time for session last lap                                    |
|LapDeltaToSessionLastlLap_DD    |s/s                  |float    |1    |1    | Rate of change of delta time for session last lap                  |
|LapDeltaToSessionLastlLap_OK    |                     |bool     |1    |1    | Delta time for session last lap is valid                           |
|LapDeltaToSessionOptimalLap     |s                    |float    |1    |1    | Delta time for session optimal lap                                 |
|LapDeltaToSessionOptimalLap_DD  |s/s                  |float    |1    |1    | Rate of change of delta time for session optimal lap               |
|LapDeltaToSessionOptimalLap_OK  |                     |bool     |1    |1    | Delta time for session optimal lap is valid                        |
|LapDist                         |m                    |float    |1    |1    | Meters traveled from S/F this lap                                  |
|LapDistPct                      |%                    |float    |1    |1    | Percentage distance around lap                                     |
|LapLasNLapSeq                   |                     |int      |1    |1    | Player num consecutive clean laps completed for N average          |
|Name                            | Unit                | Type    |Disk |Live | Description                                                        |
|LapLastLapTime                  |s                    |float    |1    |1    | Players last lap time                                              |
|LapLastNLapTime                 |s                    |float    |1    |1    | Player last N average lap time                                     |
|Lat                             |deg                  |double   |1    |1    | Latitude in decimal degrees                                        |
|LatAccel                        |m/s^2                |float    |1    |1    | Lateral acceleration (including gravity)                           |
|Lon                             |deg                  |double   |1    |1    | Longitude in decimal degrees                                       |
|LongAccel                       |m/s^2                |float    |1    |1    | Longitudinal acceleration (including gravity)                      |
|ManifoldPress                   |bar                  |float    |1    |1    | Engine manifold pressure                                           |
|OilLevel                        |l                    |float    |1    |1    | Engine oil level                                                   |
|OilPress                        |bar                  |float    |1    |1    | Engine oil pressure                                                |
|OilTemp                         |C                    |float    |1    |1    | Engine oil temperature                                             |
|OnPitRoad                       |                     |bool     |1    |1    | Is the player car on pit road between the cones                    |
|Pitch                           |rad                  |float    |1    |1    | Pitch orientation                                                  |
|PitchRate                       |rad/s                |float    |1    |1    | Pitch rate                                                         |
|PitOptRepairLeft                |s                    |float    |1    |1    | Time left for optional repairs if repairs are active               |
|PitRepairLeft                   |s                    |float    |1    |1    | Time left for mandatory pit repairs if repairs are active          |
|PitSvFlags                      |irsdk_PitSvFlags     |bitfield |1    |1    | Bitfield of pit service checkboxes                                 |
|PitSvFuel                       |l                    |float    |1    |1    | Pit service fuel add amount                                        |
|PitSvLFP                        |kPa                  |float    |1    |1    | Pit service left front tire pressure                               |
|PitSvLRP                        |kPa                  |float    |1    |1    | Pit service left rear tire pressure                                |
|PitSvRFP                        |kPa                  |float    |1    |1    | Pit service right front tire pressure                              |
|PitSvRRP                        |kPa                  |float    |1    |1    | Pit service right rear tire pressure                               |
|PlayerCarClassPosition          |                     |int      |1    |1    | Players class position in race                                     |
|PlayerCarPosition               |                     |int      |1    |1    | Players position in race                                           |
|RaceLaps                        |                     |int      |0    |1    | Laps completed in race                                             |
|RadioTransmitCarIdx             |                     |int      |0    |1    | The car index of the current person speaking on the radio          |
|RadioTransmitFrequencyIdx       |                     |int      |0    |1    | The frequency index of the current person speaking on the raio     |
|RadioTransmitRadioIdx           |                     |int      |0    |1    | The radio index of the current person speaking on the radio        |
|RelativeHumidity                |%                    |float    |1    |1    | Relative Humidity                                                  |
|ReplayFrameNum                  |                     |int      |0    |1    | Integer replay frame number (60 per second)                        |
|ReplayFrameNumEnd               |                     |int      |0    |1    | Integer replay frame number from end of tape                       |
|ReplayPlaySlowMotion            |                     |bool     |0    |1    | 0=not slow motion,1=replay is in slow motion                       |
|ReplayPlaySpeed                 |                     |int      |0    |1    | Replay playback speed                                              |
|ReplaySessionNum                |                     |int      |0    |1    | Replay session number                                              |
|ReplaySessionTime               |s                    |double   |0    |1    | Seconds since replay session start                                 |
|Roll                            |rad                  |float    |1    |1    | Roll orientation                                                   |
|RollRate                        |rad/s                |float    |1    |1    | Roll rate                                                          |
|RPM                             |revs/min             |float    |1    |1    | Engine rpm                                                         |
|SessionFlags                    |irsdk_Flags          |bitfield |0    |1    | Session flags                                                      |
|SessionLapsRemain               |                     |int      |1    |1    | Laps left till session ends                                        |
|SessionNum                      |                     |int      |1    |1    | Session number                                                     |
|SessionState                    |irsdk_SessionState   |int      |1    |1    | Session state                                                      |
|SessionTime                     |s                    |double   |1    |1    | Seconds since session start                                        |
|SessionTimeRemain               |s                    |double   |1    |1    | Seconds left till session ends                                     |
|SessionUniqueID                 |                     |int      |1    |1    | Session ID                                                         |
|ShiftGrindRPM                   |RPM                  |float    |1    |1    | RPM of shifter grinding noise                                      |
|ShiftIndicatorPct               |%                    |float    |1    |1    | DEPRECATED use DriverCarSLBlinkRPM instead                         |
|ShiftPowerPct                   |%                    |float    |1    |1    | Friction torque applied to gears when shifting or grinding         |
|Skies                           |                     |int      |1    |1    | Skies (0=clear/1=p cloudy/2=m cloudy/3=overcast)                   |
|Speed                           |m/s                  |float    |1    |1    | GPS vehicle speed                                                  |
|SteeringWheelAngle              |rad                  |float    |1    |1    | Steering wheel angle                                               |
|SteeringWheelAngleMax           |rad                  |float    |1    |1    | Steering wheel max angle                                           |
|SteeringWheelPctDamper          |%                    |float    |1    |1    | Force feedback % max damping                                       |
|SteeringWheelPctTorque          |%                    |float    |1    |1    | Force feedback % max torque on steering shaft unsigned             |
|SteeringWheelPctTorqueSign      |%                    |float    |1    |1    | Force feedback % max torque on steering shaft signed               |
|SteeringWheelPctTorqueSignStops |%                    |float    |1    |1    | Force feedback % max torque on steering shaft signed stops         |
|SteeringWheelPeakForceNm        |N*m                  |float    |0    |1    | Peak torque mapping to direct input units for FFB                  |
|SteeringWheelTorque             |N*m                  |float    |1    |1    | Output torque on steering shaft                                    |
|Throttle                        |%                    |float    |1    |1    | 0=off throttle to 1=full throttle                                  |
|ThrottleRaw                     |%                    |float    |1    |1    | Raw throttle input 0=off throttle to 1=full throttle               |
|TrackTemp                       |C                    |float    |1    |1    | Temperature of track at start/finish line                          |
|TrackTempCrew                   |C                    |float    |1    |1    | Temperature of track measured by crew around track                 |
|VelocityX                       |m/s                  |float    |1    |1    | X velocity                                                         |
|VelocityY                       |m/s                  |float    |1    |1    | Y velocity                                                         |
|VelocityZ                       |m/s                  |float    |1    |1    | Z velocity                                                         |
|VertAccel                       |m/s^2                |float    |1    |1    | Vertical acceleration (including gravity)                          |
|Voltage                         |V                    |float    |1    |1    | Engine voltage                                                     |
|WaterLevel                      |l                    |float    |1    |1    | Engine coolant level                                               |
|WaterTemp                       |C                    |float    |1    |1    | Engine coolant temp                                                |
|WeatherType                     |                     |int      |1    |1    | Weather type (0=constant,1=dynamic)                                |
|WindDir                         |rad                  |float    |1    |1    | Wind direction at start/finish line                                |
|WindVel                         |m/s                  |float    |1    |1    | Wind velocity at start/finish line                                 |
|Yaw                             |rad                  |float    |1    |1    | Yaw orientation                                                    |
|YawNorth                        |rad                  |float    |1    |1    | Yaw orientation relative to north                                  |
|YawRate                         |rad/s                |float    |1    |1    | Yaw rate                                                           |

In addition to the above variables that are always available, there are several variables that only show up if a car implements that particular sensor type.

|Name                    |Unit|Type  |Disk|Live| Description                                        |
|------------------------|----|------|----|----|----------------------------------------------------|
|CFrideHeight            |m   |float |1   |0   | CF ride height                                     |
|CFshockDefl             |m   |float |1   |1   | CF shock deflection                                |
|CFshockVel              |m/s |float |1   |1   | CF shock velocity                                  |
|CFSRrideHeight          |m   |float |1   |0   | CFSR ride height                                   |
|CRrideHeight            |m   |float |1   |0   | CR ride height                                     |
|CRshockDefl             |m   |float |1   |1   | CR shock deflection                                |
|CRshockVel              |m/s |float |1   |1   | CR shock velocity                                  |
|dcABS                   |    |float |1   |1   | In car abs adjustment                              |
|dcAntiRollFront         |    |float |1   |1   | In car front anti roll bar adjustment              |
|dcAntiRollRear          |    |float |1   |1   | In car rear anti roll bar adjustment               |
|dcBoostLevel            |    |float |1   |1   | In car boost level adjustment                      |
|dcBrakeBias             |    |float |1   |1   | In car brake bias adjustment                       |
|dcBrakeBias             |    |float |1   |1   | In car brake bias adjustment                       |
|dcDiffEntry             |    |float |1   |1   | In car diff entry adjustment                       |
|dcDiffExit              |    |float |1   |1   | In car diff exit adjustment                        |
|dcDiffMiddle            |    |float |1   |1   | In car diff middle adjustment                      |
|dcEngineBraking         |    |float |1   |1   | In car engine braking adjustment                   |
|dcEnginePower           |    |float |1   |1   | In car engine power adjustment                     |
|dcFuelMixture           |    |float |1   |1   | In car fuel mixture adjustment                     |
|dcRevLimiter            |    |float |1   |1   | In car rev limiter adjustment                      |
|dcThrottleShape         |    |float |1   |1   | In car throttle shape adjustment                   |
|dcTractionControl       |    |float |1   |1   | In car traction control adjustment                 |
|dcTractionControl2      |    |float |1   |1   | In car traction control 2 adjustment               |
|dcTractionControlToggle |    |bool  |1   |1   | In car traction control active                     |
|dcWeightJackerLeft      |    |float |1   |1   | In car left weight jacker adjustment               |
|dcWeightJackerRight     |    |float |1   |1   | In car right weight jacker adjustment              |
|dcWingFront             |    |float |1   |1   | In car front wing adjustment                       |
|dcWingRear              |    |float |1   |1   | In car rear wing adjustment                        |
|dpFNOMKnobSetting       |    |float |1   |1   | Pitstop front flap adjustment                      |
|dpFUFangleIndex         |    |float |1   |1   | Pitstop front upper flap adjustment                |
|dpFWingAngle            |    |float |1   |1   | Pitstop front wing adjustment                      |
|dpFWingIndex            |    |float |1   |1   | Pitstop front wing adjustment                      |
|dpLrWedgeAdj            |    |float |1   |1   | Pitstop lr spring offset adjustment                |
|dpPSSetting             |    |float |1   |1   | Pitstop power steering adjustment                  |
|dpQtape                 |    |float |1   |1   | Pitstop qtape adjustment                           |
|dpRBarSetting           |    |float |1   |1   | Pitstop rear bar adjustment                        |
|dpRFTruckarmP1Dz        |    |float |1   |1   | Pitstop rftruckarmP1Dz adjustment                  |
|dpRRDamperPerchOffsetm  |    |float |1   |1   | Pitstop right rear dampter perch offset adjustment |
|dpRrPerchOffsetm        |    |float |1   |1   | Pitstop right rear spring offset adjustment        |
|dpRrWedgeAdj            |    |float |1   |1   | Pitstop rr spring offset adjustment                |
|dpRWingAngle            |    |float |1   |1   | Pitstop rear wing adjustment                       |
|dpRWingIndex            |    |float |1   |1   | Pitstop rear wing adjustment                       |
|dpRWingSetting          |    |float |1   |1   | Pitstop rear wing adjustment                       |
|dpTruckarmP1Dz          |    |float |1   |1   | Pitstop truckarmP1Dz adjustment                    |
|dpWedgeAdj              |    |float |1   |1   | Pitstop wedge adjustment                           |
|LFbrakeLinePress        |bar |float |1   |1   | LF brake line pressure as set in the garage        |
|LFcoldPressure          |kPa |float |1   |1   | LF tire cold pressure                              |
|LFpressure              |kPa |float |1   |0   | LF tire pressure                                   |
|LFrideHeight            |m   |float |1   |0   | LF ride height                                     |
|LFshockDefl             |m   |float |1   |1   | LF shock deflection                                |
|LFshockVel              |m/s |float |1   |1   | LF shock velocity                                  |
|LFspeed                 |m/s |float |1   |1   | LF wheel speed                                     |
|LFtempCL                |C   |float |1   |1   | LF tire left carcass temperature                   |
|LFtempCM                |C   |float |1   |1   | LF tire middle carcass temperature                 |
|LFtempCR                |C   |float |1   |1   | LF tire right carcass temperature                  |
|LFtempL                 |C   |float |1   |0   | LF tire left surface temperature                   |
|LFtempM                 |C   |float |1   |0   | LF tire middle surface temperature                 |
|LFtempR                 |C   |float |1   |0   | LF tire right surface temperature                  |
|LFwearL                 |%   |float |1   |1   | LF tire left percent tread remaining               |
|LFwearM                 |%   |float |1   |1   | LF tire middle percent tread remaining             |
|LFwearR                 |%   |float |1   |1   | LF tire right percent tread remaining              |
|LRbrakeLinePress        |bar |float |1   |1   | LR brake line pressure as set in the garage        |
|LRcoldPressure          |kPa |float |1   |1   | LR tire cold pressure                              |
|LRpressure              |kPa |float |1   |0   | LR tire pressure                                   |
|LRrideHeight            |m   |float |1   |0   | LR ride height                                     |
|LRshockDefl             |m   |float |1   |1   | LR shock deflection                                |
|LRshockVel              |m/s |float |1   |1   | LR shock velocity                                  |
|LRspeed                 |m/s |float |1   |1   | LR wheel speed                                     |
|LRtempCL                |C   |float |1   |1   | LR tire left carcass temperature                   |
|LRtempCM                |C   |float |1   |1   | LR tire middle carcass temperature                 |
|LRtempCR                |C   |float |1   |1   | LR tire right carcass temperature                  |
|LRtempL                 |C   |float |1   |0   | LR tire left surface temperature                   |
|LRtempM                 |C   |float |1   |0   | LR tire middle surface temperature                 |
|LRtempR                 |C   |float |1   |0   | LR tire right surface temperature                  |
|LRwearL                 |%   |float |1   |1   | LR tire left percent tread remaining               |
|LRwearM                 |%   |float |1   |1   | LR tire middle percent tread remaining             |
|LRwearR                 |%   |float |1   |1   | LR tire right percent tread remaining              |
|RFbrakeLinePress        |bar |float |1   |1   | RF brake line pressure as set in the garage        |
|RFcoldPressure          |kPa |float |1   |1   | RF tire cold pressure                              |
|RFpressure              |kPa |float |1   |0   | RF tire pressure                                   |
|RFrideHeight            |m   |float |1   |0   | RF ride height                                     |
|RFshockDefl             |m   |float |1   |1   | RF shock deflection                                |
|RFshockVel              |m/s |float |1   |1   | RF shock velocity                                  |
|RFspeed                 |m/s |float |1   |1   | RF wheel speed                                     |
|RFtempCL                |C   |float |1   |1   | RF tire left carcass temperature                   |
|RFtempCM                |C   |float |1   |1   | RF tire middle carcass temperature                 |
|RFtempCR                |C   |float |1   |1   | RF tire right carcass temperature                  |
|RFtempL                 |C   |float |1   |0   | RF tire left surface temperature                   |
|RFtempM                 |C   |float |1   |0   | RF tire middle surface temperature                 |
|RFtempR                 |C   |float |1   |0   | RF tire right surface temperature                  |
|RFwearL                 |%   |float |1   |1   | RF tire left percent tread remaining               |
|RFwearM                 |%   |float |1   |1   | RF tire middle percent tread remaining             |
|RFwearR                 |%   |float |1   |1   | RF tire right percent tread remaining              |
|RRbrakeLinePress        |bar |float |1   |1   | RR brake line pressure as set in the garage        |
|RRcoldPressure          |kPa |float |1   |1   | RR tire cold pressure                              |
|RRpressure              |kPa |float |1   |0   | RR tire pressure                                   |
|RRrideHeight            |m   |float |1   |0   | RR ride height                                     |
|RRshockDefl             |m   |float |1   |1   | RR shock deflection                                |
|RRshockVel              |m/s |float |1   |1   | RR shock velocity                                  |
|RRspeed                 |m/s |float |1   |1   | RR wheel speed                                     |
|RRtempCL                |C   |float |1   |1   | RR tire left carcass temperature                   |
|RRtempCM                |C   |float |1   |1   | RR tire middle carcass temperature                 |
|RRtempCR                |C   |float |1   |1   | RR tire right carcass temperature                  |
|RRtempL                 |C   |float |1   |0   | RR tire left surface temperature                   |
|RRtempM                 |C   |float |1   |0   | RR tire middle surface temperature                 |
|RRtempR                 |C   |float |1   |0   | RR tire right surface temperature                  |
|RRwearL                 |%   |float |1   |1   | RR tire left percent tread remaining               |
|RRwearM                 |%   |float |1   |1   | RR tire middle percent tread remaining             |
|RRwearR                 |%   |float |1   |1   | RR tire right percent tread remaining              |
