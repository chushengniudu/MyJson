package com.liuzheng.admin.myjson;

import java.util.List;

/**
 * 作者：刘正
 * 时间：2016/11/22 0022
 * 作用：
 */

public class VRConfig {

    /**
     * success : true
     * root : [{"id":"100","type":"bpsVideo","icon":"","assetURL":"vr.mp4","pid":0,"canvasWidth":4096,"canvasHeight":2048,"points":[{"name":"VR-Back","type":"type3","posX":2048,"posY":256,"goToId":"VR-Back"},{"name":"main","type":"type1","posX":3940,"posY":900,"goToId":"101"}]},{"id":"101","type":"bppVideo","icon":"","assetURL":"main.mp4","pid":"100","canvasWidth":1920,"canvasHeight":1080,"points":[{"name":"return","type":"type3","posX":960,"posY":690,"goToId":"100"}]}]
     */

    private boolean success;
    private List<RootEntity> root;

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setRoot(List<RootEntity> root) {
        this.root = root;
    }

    public boolean getSuccess() {
        return success;
    }

    public List<RootEntity> getRoot() {
        return root;
    }

    public static class RootEntity {
        /**
         * id : 100
         * type : bpsVideo
         * icon :
         * assetURL : vr.mp4
         * pid : 0
         * canvasWidth : 4096
         * canvasHeight : 2048
         * points : [{"name":"VR-Back","type":"type3","posX":2048,"posY":256,"goToId":"VR-Back"},{"name":"main","type":"type1","posX":3940,"posY":900,"goToId":"101"}]
         */

        private String id;
        private String type;
        private String icon;
        private String assetURL;
        private int pid;
        private int canvasWidth;
        private int canvasHeight;
        private List<PointsEntity> points;

        public void setId(String id) {
            this.id = id;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setIcon(String icon) {
            this.icon = icon;
        }

        public void setAssetURL(String assetURL) {
            this.assetURL = assetURL;
        }

        public void setPid(int pid) {
            this.pid = pid;
        }

        public void setCanvasWidth(int canvasWidth) {
            this.canvasWidth = canvasWidth;
        }

        public void setCanvasHeight(int canvasHeight) {
            this.canvasHeight = canvasHeight;
        }

        public void setPoints(List<PointsEntity> points) {
            this.points = points;
        }

        public String getId() {
            return id;
        }

        public String getType() {
            return type;
        }

        public String getIcon() {
            return icon;
        }

        public String getAssetURL() {
            return assetURL;
        }

        public int getPid() {
            return pid;
        }

        public int getCanvasWidth() {
            return canvasWidth;
        }

        public int getCanvasHeight() {
            return canvasHeight;
        }

        public List<PointsEntity> getPoints() {
            return points;
        }

        public static class PointsEntity {
            /**
             * name : VR-Back
             * type : type3
             * posX : 2048
             * posY : 256
             * goToId : VR-Back
             */

            private String name;
            private String type;
            private int posX;
            private int posY;
            private String goToId;

            public void setName(String name) {
                this.name = name;
            }

            public void setType(String type) {
                this.type = type;
            }

            public void setPosX(int posX) {
                this.posX = posX;
            }

            public void setPosY(int posY) {
                this.posY = posY;
            }

            public void setGoToId(String goToId) {
                this.goToId = goToId;
            }

            public String getName() {
                return name;
            }

            public String getType() {
                return type;
            }

            public int getPosX() {
                return posX;
            }

            public int getPosY() {
                return posY;
            }

            public String getGoToId() {
                return goToId;
            }
        }
    }
}

