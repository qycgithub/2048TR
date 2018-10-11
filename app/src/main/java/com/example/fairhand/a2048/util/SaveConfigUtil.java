package com.example.fairhand.a2048.util;

import android.content.Context;
import android.content.SharedPreferences;

import com.example.fairhand.a2048.app.Config;

/**
 * Created by FairHand on 2018/10/4.<br />
 * 保存配置工具
 */
public class SaveConfigUtil {
    
    /**
     * 保存最高分
     */
    public static void putBestScore(Context context, int bestScore) {
        SharedPreferences.Editor editor = context.getSharedPreferences(
                Config.SAVE_BEST_SCORE, Context.MODE_PRIVATE).edit();
        switch (Config.GIRDColumnCount) {
            case 4:// 难度4
                editor.putInt(Config.KEY_BEST_SCORE_WITHIN_4, bestScore).apply();
                break;
            case 5:// 难度5
                editor.putInt(Config.KEY_BEST_SCORE_WITHIN_5, bestScore).apply();
                break;
            case 6:// 难度6
                editor.putInt(Config.KEY_BEST_SCORE_WITHIN_6, bestScore).apply();
                break;
            default:
                break;
        }
    }
    
    /**
     * 获取最高分
     */
    public static int getBestScore(Context context) {
        SharedPreferences sharedPreferences =
                context.getSharedPreferences(Config.SAVE_BEST_SCORE, Context.MODE_PRIVATE);
        switch (Config.GIRDColumnCount) {
            case 4:// 难度4
                return sharedPreferences.getInt(Config.KEY_BEST_SCORE_WITHIN_4, 0);
            case 5:// 难度5
                return sharedPreferences.getInt(Config.KEY_BEST_SCORE_WITHIN_5, 0);
            case 6:// 难度6
                return sharedPreferences.getInt(Config.KEY_BEST_SCORE_WITHIN_6, 0);
            default:
                return 0;
        }
    }
    
    /**
     * 保存无限模式下最高分
     */
    public static void putBestScoreWithinInfinite(Context context, int bestScore) {
        SharedPreferences.Editor editor = context.getSharedPreferences(
                Config.SAVE_BEST_SCORE, Context.MODE_PRIVATE).edit();
        editor.putInt(Config.KEY_BEST_SCORE_WITHIN_INFINITE, bestScore).apply();
    }
    
    /**
     * 获取无限模式下最高分
     */
    public static int getBestScoreWithinInfinite(Context context) {
        SharedPreferences sharedPreferences =
                context.getSharedPreferences(Config.SAVE_BEST_SCORE, Context.MODE_PRIVATE);
        return sharedPreferences.getInt(Config.KEY_BEST_SCORE_WITHIN_INFINITE, 0);
    }
    
    /**
     * 保存游戏难度
     */
    public static void putGameDifficulty(Context context, int difficulty) {
        SharedPreferences.Editor editor = context.getSharedPreferences(
                Config.SAVE_GAME_DIFFICULTY, Context.MODE_PRIVATE).edit();
        editor.putInt(Config.KEY_GAME_DIFFICULTY, difficulty).apply();
    }
    
    /**
     * 获取游戏难度
     */
    public static int getGameDifficulty(Context context) {
        SharedPreferences sharedPreferences =
                context.getSharedPreferences(Config.SAVE_GAME_DIFFICULTY, Context.MODE_PRIVATE);
        return sharedPreferences.getInt(Config.KEY_GAME_DIFFICULTY, 4);
    }
    
    /**
     * 保存游戏音效状态
     */
    public static void putGameVolume(Context context, boolean volumeState) {
        SharedPreferences.Editor editor = context.getSharedPreferences(
                Config.SAVE_GAME_VOLUME_STATE, Context.MODE_PRIVATE).edit();
        editor.putBoolean(Config.KEY_GAME_VOLUME_STATE, volumeState).apply();
    }
    
    /**
     * 获取游戏音效状态
     */
    public static boolean getGameVolumeState(Context context) {
        SharedPreferences sharedPreferences =
                context.getSharedPreferences(Config.SAVE_GAME_VOLUME_STATE, Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean(Config.KEY_GAME_VOLUME_STATE, true);
    }
    
    /**
     * 保存达成游戏目标次数
     */
    public static void putGoalTime(Context context, int time) {
        SharedPreferences.Editor editor = context.getSharedPreferences(
                Config.SAVE_GET_GOAL_TIME, Context.MODE_PRIVATE).edit();
        editor.putInt(Config.KEY_GET_GOAL_TIME, time).apply();
    }
    
    /**
     * 获取达成游戏目标次数
     */
    public static int getGoalTime(Context context) {
        SharedPreferences sharedPreferences =
                context.getSharedPreferences(Config.SAVE_GET_GOAL_TIME, Context.MODE_PRIVATE);
        return sharedPreferences.getInt(Config.KEY_GET_GOAL_TIME, 0);
    }
    
    /**
     * 保存游戏模式
     */
    public static void putCurrentGameMode(Context context, int mode) {
        SharedPreferences.Editor editor = context.getSharedPreferences(
                Config.SAVE_CURRENT_GAME_MODE, Context.MODE_PRIVATE).edit();
        editor.putInt(Config.KEY_CURRENT_GAME_MOE, mode).apply();
    }
    
    /**
     * 获取游戏模式
     */
    public static int getCurrentGameMode(Context context) {
        SharedPreferences sharedPreferences =
                context.getSharedPreferences(Config.SAVE_CURRENT_GAME_MODE, Context.MODE_PRIVATE);
        return sharedPreferences.getInt(Config.KEY_CURRENT_GAME_MOE, 0);
    }
    
    /**
     * 保存忽略更新版本号
     */
    public static void putIgnoreVersionCode(Context context, float code) {
        SharedPreferences.Editor editor = context.getSharedPreferences(
                Config.SAVE_IGNORE_VERSION_CODE, Context.MODE_PRIVATE).edit();
        editor.putFloat(Config.KEY_IGNORE_VERSION_CODE, code).apply();
    }
    
    /**
     * 获取忽略更新版本号
     */
    public static float getIgnoreVersionCode(Context context) {
        SharedPreferences sharedPreferences =
                context.getSharedPreferences(Config.SAVE_IGNORE_VERSION_CODE, Context.MODE_PRIVATE);
        return sharedPreferences.getFloat(Config.KEY_IGNORE_VERSION_CODE, 0);
    }
    
}
