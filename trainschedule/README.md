# trainschedule

## Service FLOW

### Work progres while creating packeges
Entiy > util > Service > dto > Serviceimp > repository>  Controller

### Data flow when API called
INFLOW-->
        API(dto) > Controller(dto as requestbody) > Service(dto) > Serviceimp(dto) > TrainIdGenerator > repsitory (dto)

                                                                                                                   <---OUTFLOW
        API (Train) < Controller(Train as response entity) < Service(Train) < Serviceimp(Train) < repository(Train)

## Rest End Points (APIs)

1. Create Train (ADMIN)

## Database Entity

### Train

1. tuid [Long] 5 didgit auto generated
2. trainName [string]
3. startStation [string]
4. endStation [string]
5. departureTime [string]
6. arrivalTime [string]
7. status [string]
