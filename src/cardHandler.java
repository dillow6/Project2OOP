/**
 *
 * @author Dylan Lowman and Jacob Hewgley
 */
public class Card {
        //variables of each card
        CardColor color;
        CardValue value;
        
        //constructor says that the card has two attributes, color and value 
         public Card(CardColor color, CardValue value){                      
           this.color = color;
           this.value = value;
        }
        
         enum CardColor{
            BLUE,YELLOW,GREEN,RED,WILD;
            
            //takes all the enums and puts it into an array that makes it private
            private static CardColor colors[] = CardColor.values();
            //lets you acess the color by its index in the array 
            public static CardColor getColor(int color){
                return CardColor.colors[color];
            }
        }
     
        enum CardValue {
            //has a string attached to its enum value called action and holds the value/action of it that can be changed to actual 
            //implementation through a switch statement 
            Zero("0"),One("1"),Two("2"),Three("3"),Four("4"),Five("5"),Six("6"),Seven("7"),Eight("8"),Nine("9"),
            Reverse("BACKINDECK"),Skip("DONTDOCOLOR"),Draw2("x2"),Draw4("x4");
            
            
            private final String action;
            //constructor for the action 
            private CardValue(final String action){
                this.action = action;
            }
            //acessor to access card action
            public final String getAction()
            { 
                return action;
            }
            //takes all the enums and puts it into an array that makes it private
            private static CardValue values[] = CardValue.values();
            //lets you acess the value by its index in the array 
            public static CardValue getValue(int value){
                
                return CardValue.values[value];
                
            }
        }
        
       
}

