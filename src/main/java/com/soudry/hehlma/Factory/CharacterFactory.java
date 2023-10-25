package com.soudry.hehlma.Factory;

import com.soudry.hehlma.Exceptions.CharacterNotFoundException;
import com.soudry.hehlma.Models.Character;
import com.soudry.hehlma.Models.Knight;
import com.soudry.hehlma.Models.Rogue;
import com.soudry.hehlma.Models.Witch;

public class CharacterFactory {
    public static Character decideCharacterClass(String role) {
        switch(role) {
            case "knight":
                return new Knight();
            case "rogue":
                return new Rogue();
            case "witch":
                return new Witch();
            default:
                throw new CharacterNotFoundException(role + " class not found!");
        }
}
}