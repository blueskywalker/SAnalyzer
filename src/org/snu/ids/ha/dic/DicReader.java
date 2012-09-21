package org.snu.ids.ha.dic;

import java.io.IOException;

public abstract interface DicReader
{
  public abstract String readLine()
    throws IOException;

  public abstract void cleanup()
    throws IOException;
}

/* Location:           /Users/blueskywalker/Source/OpenSource/korean/org.snu.ids.ha.jar
 * Qualified Name:     org.snu.ids.ha.dic.DicReader
 * JD-Core Version:    0.6.1
 */
