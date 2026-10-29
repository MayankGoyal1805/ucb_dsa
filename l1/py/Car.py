class Car:
    
    def __init__(self, m):
        self.model = m
        self.wheels = 4
        
    def drive(self):
        if (self.wheels < 4):
            print(self.model , "no go vroom")
            return 
        print(self.model , "goes vroom")
    
    def getNumWheels(self):
        return self.wheels
    
    def driveIntoDitch(self, wheelsLost):
        self.wheels = self.wheels - wheelsLost
        
c1 = Car("Civic Type R")
c2 = Car("Totato Camry")

c1.drive()
c1.driveIntoDitch(2)
c1.drive()

print(c2.getNumWheels())