
# dummyirctc
This project is to prepare a dummy IRCTC which provides services such as Train Schedule Check, Ticket Booking, PNR Status Check, Catering Order, and Delivery Status Check.

## Services
### ADMIN VIEW
#### Train Schedule
1. Admin can create a new train, its chairs, and schedule run times and stations.
2. Admin can change the scheduled time.
3. Admin can cancel the scheduled train.

#### Ticket Booking
1. Admin can assign chairs to booked passengers.
2. Admin can update the assigned chair.

#### Catering Order
1. Admin can create a food platter with a particular type number.
2. Admin can update the availability of any particular type of platter.
3. Admin can change the status of the booked order.

### USER VIEW
#### Train Schedule
1. Each scheduled train will have a unique ID (STUID).
2. Users can search for a specific train by name or number.
3. Users can search for trains by specific date and station.
4. The UI should show the result trains as a card view.

#### Ticket Booking
1. Each passenger will have a unique ID (SPUID) and each chair in the train will have a unique chair ID (TCUID).
2. Users can select any (STUID) train number and date and book with their details (Single User Booking Now).
3. Users will have a unique Booking ID (PNR) and the Ticket Status will always be on WT unless a chair is assigned by the admin.

#### PNR Status Check
1. Users can check the PNR Status for their next scheduled trains.
2. Users can cancel the booked ticket.

#### Catering Order
1. Users can choose from pre-specified food platters for lunch, breakfast, dinner, or supper/snacks as platter type 01, 02, etc.
2. The user delivery address will be the same as the user's seat number (TCUID).

#### Delivery Status Check
1. Users can check the ordered food delivery status (Accepted, Preparing, On the Way, Delivered, Canceled).
2. Users can cancel the ordered food.


