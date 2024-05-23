package com.oriharakun.kidosanswitch.mysetlist;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * テキストからファイルを読み込むためのクラス
 */
public class PathTextRead {
    
    /**
     * テキストを読み込んでリストを返す処理
     * 使うときは例外処理をしてください
     * @return リスト（String型）
     * @throws Exception
     */
    public static List<String> read() throws IOException{
        // パスの書かれたテキストのパス
        String file = Paths.get("").toAbsolutePath() + File.separator + "data" + File.separator + "path.txt";
        
        Path path = Paths.get(file);
        List<String> lines = Files.readAllLines(path);

        return lines;
    }
}
