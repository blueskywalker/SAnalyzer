 package org.snu.ids.ha.ma;
 
 import java.util.regex.Pattern;
 
 class TokenPattern
 {
   Pattern pattern = null;
   CharSetType charSetType = null;
 
   TokenPattern(String strPattern, CharSetType charSetType)
   {
     this.pattern = Pattern.compile(strPattern);
     this.charSetType = charSetType;
   }
 }

/* Location:           /Users/blueskywalker/Source/OpenSource/korean/org.snu.ids.ha.jar
 * Qualified Name:     org.snu.ids.ha.ma.TokenPattern
 * JD-Core Version:    0.6.1
 */
