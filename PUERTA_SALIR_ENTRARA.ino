void setup() {
 pinMode(13, OUTPUT);
 pinMode(12, OUTPUT);
 pinMode(2, INPUT);
 pinMode(3, INPUT);
 Serial.begin(9600);

}

void loop() {
   int a = 1;
 if(digitalRead(2)==HIGH){
    Serial.println("1");
  digitalWrite(13, HIGH);
  delay(500);
  digitalWrite(13, LOW);
 }
 if(digitalRead(3)==HIGH){
  Serial.println("2");
  digitalWrite(12, HIGH);
  delay(500);
  digitalWrite(12, LOW);
 }
 else{
  Serial.println("0");
 }
}
